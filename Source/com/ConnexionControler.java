import java.sql.*;

public class ConnexionControler extends MainControler {

    public ConnexionControler(String nom, String reference) throws SQLException {
	ClientModel client = new ClientModel();
	if(client.find(0,null,nom,reference)){
	    this.setClient(client);
	    this.setPlace();
	    this.setClasseClient();
	    this.nextCard(2);
	}

    }
}
