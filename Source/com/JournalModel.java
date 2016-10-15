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


}
