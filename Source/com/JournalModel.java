import java.sql.*;

public class JournalModel {

    public JournalModel(){}

    public int getIdDeJournal(String choix) throws SQLException{
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "SELECT id FROM Quotidien WHERE nom='"+choix+"'"; 
	ResultSet resultat = stmt.executeQuery(requete);
	if(resultat.next())
	    return resultat.getInt("id");
	else
	    return 0;
    }
    
    public boolean journalChoisi(int idQuotidien, int idClient, int idVol) throws SQLException {
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "SELECT * FROM ChoixQuotidien WHERE idQuotidien="+idQuotidien+" and idVol="+idVol+" and idClient="+idClient+""; 
	ResultSet resultat = stmt.executeQuery(requete);
	  if(resultat.next())
	      return false;
	  else
	      return true;
    }
    
    
}
