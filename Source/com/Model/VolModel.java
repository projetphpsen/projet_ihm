import java.sql.*;

public class VolModel {
    private int idVol;
    private Date depart;
    private String nom;
    private Connection con;
    
    public VolModel(){
    }
    /*
    public VolModel(int id, String nom)    {
        //Connection con = .getConnection();
        //Statement stmt = con.createStatement();
        //PreparedStatement prepare = con.prepareStatement("INSERT INTO Client (idClient, nomClient, idRes) VALUES (?,?,?)");
        //prepare.setString(1, id);
        //prepare.setString(2, nom);
        //prepare.executeUpdate();
	}*/
    public int getIdDeNomVol(String nomVol) throws SQLException{
	con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "SELECT id FROM Vol WHERE nom='"+nomVol+"'";
	ResultSet resultat = stmt.executeQuery(requete);
	if(resultat.next()){
	    idVol = resultat.getInt("id");
	    return idVol;
	}
	else
	    return 0;
    }
}
