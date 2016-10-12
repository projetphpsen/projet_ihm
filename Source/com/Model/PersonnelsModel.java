import java.sql.*;
import java.sql.SQLException;
import java.util.Date;

public class PersonnelsModel {
    private ClientModel client;
    private String[] listeTablettes;
    private String nomVol;
    
    public PersonnelsModel(){
	//this.nomVol = nomVol;
	client = new ClientModel();
    }

    /*
    public String[] getListeTablettes() throws SQLException{
	this.nomVol=nomVol;
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "SELECT tablette,reference FROM Reservation JOIN Vol JOIN Client on(Reservation.idVol=Vol.id and Reservation.idClient=Client.id) WHERE tablette=true and nomVol='"+nomVol+"'";
     	ResultSet resultat = stmt.executeQuery(requete);
	int total = resultat.getRow();
	listeTablettes = new String[total];

	if(resultat.next()){
	    int i = 0;
	    while(resultat.getString("reference")!=null){
		listeTablettes[i]=resultat.getString("reference");
		i++;
		resultat.next();
	    }
	
	}

	return listeTablettes;
	
    }
    
    public void genererPlace(String reference) throws SQLException{
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "INSERT INTO Place(reference) VALUES('"+reference+"')";
     	stmt.executeUpdate(requete);
    }
    */
    

    
}
