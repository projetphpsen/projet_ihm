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
    private Connection con;
    private boolean choixtablette;
    private String commentaireVolActuel;
    	
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
	con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "SELECT Client.nom,prenom,reference,Client.id,Vol.nom,depart,designation,choix,tablette,contenue FROM Vol join Reservation join Client join Classe join Menu join Commentaire on (Reservation.idClient=Client.id and Classe.id=Reservation.idClasse and Menu.id=Reservation.idMenu and Vol.id=Reservation.idVol and Commentaire.idClient=Client.id and Commentaire.nomVol=Vol.nom and Commentaire.idClient=Reservation.idClient) WHERE Client.nom='"+nom+"' and reference='"+refClient+"'";
	ResultSet resultat = stmt.executeQuery(requete);
	if(resultat.next()){
	    prenom = resultat.getString("prenom");
	    id = resultat.getInt("Client.id");
	    nomVol = resultat.getString("Vol.nom");
	    depart = resultat.getTimestamp("depart");
	    classeClient = resultat.getString("designation");
	    menu = resultat.getString("choix");
	    choixtablette = resultat.getBoolean("tablette");
	    commentaireVolActuel = resultat.getString("contenue");
	    if(nom != null)
		return true;
	    else
		return false;
	}
	else
	    return false;
	    
    }


    
    
    public void setchoixtablette(boolean choixtablette) throws SQLException{
	this.choixtablette = choixtablette;
	Statement stmt = con.createStatement();
	String requete = "UPDATE Reservation SET tablette="+choixtablette+"";
	stmt.executeUpdate(requete);

    }


    public void setmenu(String menu) throws SQLException{
	this.menu = menu;
	int choix = 0;
	Statement stmt = con.createStatement();
	if(menu=="normal")
	    choix = 1;
	else if(menu=="végétarien")
	    choix = 2;
	else if(menu=="sans gluten")
	    choix = 3;
	
	String requete = "UPDATE Reservation SET idMenu="+choix+" WHERE reference='"+refClient+"'";
        stmt.executeUpdate(requete);
    }

    

    public void setcommentaire (String contenue)  throws SQLException{
	Statement stmt = con.createStatement();
	String requete = null;
	if(commentaireVolActuel!=contenue){
	    requete = "UPDATE Commentaire SET contenue='"+contenue+"' WHERE idClient="+id+" and nomVol='"+nomVol+"'";
	}
	if(commentaireVolActuel ==null){
	    requete = "INSERT INTO Commentaire(idClient,nomVol,contenue) VALUES("+id+",'"+nomVol+"','"+contenue+"')";
	}
	stmt.executeUpdate(requete);
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
	return prenom;
    }

    public Date getdepart(){
	return depart;
    }

    public boolean getchoixtablette(){
	return choixtablette;
    }
    
    public String getcommentaire(String indexVol) throws SQLException{
	Statement stmt = con.createStatement();
	String requete = "SELECT contenue FROM Commentaire WHERE nomVol='"+indexVol+"' and idClient="+id+"";
	ResultSet resultat = stmt.executeQuery(requete);
	if(resultat.next())
	    return resultat.getString("contenue");
	else
	    return null;
    }

    
}
