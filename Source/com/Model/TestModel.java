import java.sql.*;
    
public class TestModel {

    public static void main(String[] args){
	//Variable pour l'authentification
	int attempt = 1;
	//Variables pour le test
	String nomClient="humbert";
	String refClient="P7A3O4Q0SYY8";
	String commentaire="Vol épouvantable!";
	boolean tablette = false;//pas de tablette
	String menu = "végétarien";//on doit mettre soit "végétarien","normal",ou"sans gluten"
	while(attempt <= 3) {
	    try {
		if(attempt > 1 )
		    System.out.println("Login or password failed, please try again.("+attempt+"/3)");
		new ConnectionDB();
		if(attempt == 3)
		    System.out.println("Authentification failed.");
		Connection con = ConnectionDB.getConnection();
		if(con != null) {
		    ClientModel c = new ClientModel();
		    System.out.println("---MODELE : ConnexionDB.java---");
		    System.out.println("- ConnectionDB.getConnection(1) : "+ConnectionDB.getConnection());
		    System.out.println("---MODELE : ClientModel.java---");
		    System.out.println("- findClient : "+c.findClient(nomClient,refClient));
		    System.out.println("- getnom : "+c.getnom());
		    System.out.println("- getprenom : "+c.getprenom()); 
		    System.out.println("- getrefClient : "+c.getrefClient());
		    System.out.println("- getnomVol : "+c.getnomVol());
		    System.out.println("- getclasseClient : "+c.getclasseClient());
		    
		    System.out.println("- getid : "+c.getid());
		    System.out.println("- getdepart : "+c.getdepart());
		    System.out.println("- getmenu(1) : "+c.getmenu());
		    System.out.println("- setmenu : "+menu);
		    c.setmenu(menu);   
		    System.out.println("- getmenu(2) :"+c.getmenu());
		    System.out.println("- getchoixtablette(1) : "+c.getchoixtablette());
		    System.out.println("- setchoixtablette : "+tablette);
		    c.setchoixtablette(tablette);
		    System.out.println("- getchoixtablette(2) : "+c.getchoixtablette());
		    System.out.println("- getcommentaire(1) : "+c.getcommentaire(c.getnomVol()));
		    System.out.println("- setcommentaire : "+commentaire);
		    c.setcommentaire(commentaire);
		    System.out.println("- getcommentaire(2) : "+c.getcommentaire(c.getnomVol()));
		    attempt = 3;
		}
		System.out.println("- ConnectionDB.disconnect");
		ConnectionDB.disconnect();
		System.out.println("- ConnectionDB.getConnection(2) : "+ConnectionDB.getConnection());
	    }
	    catch (SQLException err){
		err.printStackTrace();
	    }	
	    attempt++;
	}
    }
    

}
