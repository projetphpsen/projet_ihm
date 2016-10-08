import java.sql.*;
import java.sql.SQLException;
import java.util.Date;

public class ClientModel {
    private int id;
    private String prenom;
    private String nom;
    private String refClient;
    private String nomVol;
    private Date depart;
    private String classeClient;
    private String menu;

    public ClientModel (){}
	    
    public ClientModel(String nom, String prenom) throws SQLException{
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
        PreparedStatement prepare = con.prepareStatement("INSERT INTO Client (nom,prenom) VALUES (?,2)");
	prepare.setString(1, nom);
	prepare.setString(2,prenom);
	prepare.executeUpdate();
    }

    //Vérifie si le client et la réservation sont enregistrés
    public boolean findClient(String nomClient, String reference) throws SQLException{
	nom = nomClient;
	refClient = reference;
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "SELECT Client.nom,prenom,reference,Client.id,Vol.nom,depart,designation,choix FROM Vol join Reservation join Client join Classe join Menu on (Reservation.idClient=Client.id and Classe.id=Reservation.idClasse and Menu.id=Reservation.idMenu and Vol.id=Reservation.idVol) WHERE Client.nom='"+nom+"' and reference='"+refClient+"'";
	ResultSet resultat = stmt.executeQuery(requete);
	if(resultat.next()){
	    prenom = resultat.getString("prenom");
	    id = resultat.getInt("Client.id");
	    nomVol = resultat.getString("Vol.nom");
	    depart = resultat.getTimestamp("depart");
	    classeClient = resultat.getString("designation");
	    menu = resultat.getString("choix");
	    if(nom != null)
		return true;
	    else
		return false;
	}
	else
	    return false;
	    
    }

    public void setmenu(){
    }

    public int getid(){
	return id;
    }

    public String getnom(){
	return nom;
    }

    public String getrefClient(){
	return refClient;
    }

    public String getnomVol(){
	return nomVol;
    }

    public String getclasseClient(){
	return classeClient;
    }

    public String getmenu(){
	return menu;
    }

    public String getprenom(){
	return refClient;
    }

    public Date getdepart(){
	return depart;
    }
    
}
