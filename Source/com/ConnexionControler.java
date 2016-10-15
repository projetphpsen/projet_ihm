import java.sql.*;

public class ConnexionControler extends MainControler {

    public ConnexionControler(String nom, String reference) throws SQLException {
	ClientModel client = new ClientModel();
	if(client.find(0,null,nom,reference)){
	    
	System.out.println(client);
	    this.setClient(client);
	    this.nextCard();
	}

    }
}
