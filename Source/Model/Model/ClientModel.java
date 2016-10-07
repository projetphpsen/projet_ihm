import java.sql.*;

public class ClientModel {
    private int id;
    private String nom;
    
    public ClientModel(int id, String nom) {
	Connection con = ConnectionDB.getConnection()
	Statement stmt = con.createStatement();
        PreparedStatement prepare = con.prepareStatement("INSERT INTO Client (nom) VALUES (?)");
        //prepare.setInt(1, id);
        prepare.setString(2, nom);
        prepare.executeUpdate();
    }

    //Vérifie si le client et la réservation sont enregistrés
    public boolean verifyClient(String refClient, String nom){
	Statement stmt = con.createStatement();
	String requete = "SELECT COUNT(*) FROM Reservation join Client on (Reservation.idClient=Client.id) where Client.nom="+nom+" and reference="+refClient+"";
	ResultSet resultat = stmt.executeQuery(requete);
	if(resultat != null )
	    return true;
	else
	    return false;
    }
    
}
