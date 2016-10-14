import java.sql.*;

public class ConnexionControler {

    public ConnexionControler(String nom, String reference) throws SQLException {
	ClientModel c = new ClientModel();
	if(c.getClient(0,null,nom,reference)){
	    System.out.println("ok");
	    View.next();
	}

    }
}
