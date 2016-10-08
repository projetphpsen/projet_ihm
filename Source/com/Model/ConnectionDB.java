import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.lang.*;
import java.io.Console;

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
	    Console console = System.console();
	    String login = "reilhac";
	    String url = "jdbc:mysql://dwarves.iut-fbleau.fr/reilhac";
	    String passwd = new String(console.readPassword("password : "));
	    con = DriverManager.getConnection(url,login,passwd);
	}
	catch(SQLException e){
	}
	
	
    }
    
    public static Connection getConnection(){
	return con;
    }
        
}
