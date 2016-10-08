import java.sql.*;
    
public class TestModel {

    public static void main(String[] args){
	//Variables pour le test
	String nomClient="umbert";
	String refClient="P7A3O4Q0SYY8";
	try {
	    System.out.println("---TESTS DES MODELES---");
	    System.out.print("+ Connexion au serveur : ");
	    new ConnectionDB();
	    Connection con = ConnectionDB.getConnection();
	    if(con != null) {
		System.out.println("ouverte");
		System.out.println("---MODELE : ConnexionDB.java---");
		System.out.println("- getConnection() : "+ConnectionDB.getConnection());
		System.out.println("---MODELE : ClientModel.java---");
		System.out.println("- findClient : "+ClientModel.findClient(nomClient,refClient));
		System.out.println("- getClientClass : "+ClientModel.getClientClass(nomClient,refClient)+"");
	    }
	    else {
		System.out.print("échouée");
		System.out.println("ARRET DES TESTS");
	    }
	    con = null;
	    System.out.println("---FIN DES TESTS---");
	    System.out.println("+ Connexion au serveur : fermée");
	    
	}
	catch (SQLException err){
	    System.out.println(err.getMessage());
	}	
	    
    }


}
