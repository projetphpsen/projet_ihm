import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class ConnectionDB {

    private static Connection con;
    
    public ConnectionDB(){
	try{
	     String login = "projetihm";
	     String passwd = "mhitejorp";
	     String url = "http://dwarves.iut-fbleau.fr";
	     con = DriverManager.getConnection(url,login,passwd);
	}
	catch (SQLException err){
	    System.out.println(err.getMessage());
	}
    }
    
    public static Connection getConnection(){
	return con;
    }
        
}
