import java.sql.*;
import java.sql.SQLException;

public class ClientModel {
    private int id;
    private String nom;
    
    public ClientModel(String nom, String prenom) throws SQLException{
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
        PreparedStatement prepare = con.prepareStatement("INSERT INTO Client (nom,prenom) VALUES (?,2)");
	prepare.setString(1, nom);
	prepare.setString(2,prenom);
	prepare.executeUpdate();
    }

    //Vérifie si le client et la réservation sont enregistrés
    public boolean verifyClient(String refClient, String nom) throws SQLException{
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "SELECT COUNT(*) FROM Reservation join Client on (Reservation.idClient=Client.id) where Client.nom="+nom+" and reference="+refClient+"";
	ResultSet resultat = stmt.executeQuery(requete);
	if(resultat != null )
	    return true;
	else
	    return false;
    }

    
    public String getClientClass(String refClient, String nom) throws SQLException{
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "SELECT designation FROM Client JOIN Reservation JOIN Classe ON (Reservation.idClient=Client.id and Classe.id=Reservation.idClasse) WHERE nom="+nom+" and reference="+refClient+" ";
	ResultSet resultat = stmt.executeQuery(requete);
	String classeClient = resultat.getString("designation");
	return classeClient;
    }
    
    
}
