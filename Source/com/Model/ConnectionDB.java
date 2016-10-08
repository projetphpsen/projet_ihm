import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.lang.*;

public class ConnectionDB {

    private static Connection con;
    
    public ConnectionDB(){
	try{
	    Class.forName("com.mysql.jdbc.Driver");
	}
	catch(ClassNotFoundException e){
	    e.printStackTrace();
	}
	try{
	    String login = "projetihm";
	    String passwd = "mhitejorp";
	    String url = "jdbc:mysql://dwarves.iut-fbleau.fr/projetihm";
	    con = DriverManager.getConnection(url,login,passwd);

	}
	catch(SQLException e){
	    e.printStackTrace();
	}

	
    }
    
    public static Connection getConnection(){
	return con;
    }
        
}
