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
		    System.out.println("Wrong password, please try again.("+attempt+"/3)");
		new ConnectionDB();
		Connection con = ConnectionDB.getConnection();
		if(con != null) {
		    System.out.println("---MODELE : ConnexionDB.java---");
		    System.out.println("- getConnection() : "+ConnectionDB.getConnection());
		    System.out.println("---MODELE : ClientModel.java---");
		    System.out.println("- findClient : "+ClientModel.findClient(nomClient,refClient));
		    System.out.println("- getClientClass : "+ClientModel.getClientClass(nomClient,refClient)+"");
		}
		con = null;
	    }
	    catch (SQLException err){
	    }	
	    attempt++;
	}
    }
    

}
