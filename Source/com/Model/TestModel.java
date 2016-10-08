import java.sql.*;
    
public class TestModel {

    public static void main(String[] args){
	int attempt = 1;
	//Variables pour le test
	String nomClient="humbert";
	String refClient="P7A3O4Q0SYY8";
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
		    System.out.println("- getConnection : "+ConnectionDB.getConnection());
		    System.out.println("---MODELE : ClientModel.java---");
		    System.out.println("- findClient : "+c.findClient(nomClient,refClient));
		    System.out.println("- getnom : "+c.getnom());
		    System.out.println("- getprenom : "+c.getprenom()); 
		    System.out.println("- getrefClient : "+c.getrefClient());
		    System.out.println("- getnomVol : "+c.getnomVol());
		    System.out.println("- getclasseClient : "+c.getclasseClient());
		    System.out.println("- getmenu : "+c.getmenu());
		    System.out.println("- getid : "+c.getid());
		    System.out.println("- getdepart : "+c.getdepart());
		    attempt = 3;
		}
		con = null;
	    }
	    catch (SQLException err){
	    }	
	    attempt++;
	}
    }
    

}
