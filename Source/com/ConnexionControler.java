import java.sql.*;

public class ConnexionControler extends MainControler {

    public ConnexionControler(String nom, String reference) throws SQLException {
	ClientModel c = new ClientModel();
	if(c.getClient(0,null,nom,reference)){
	    this.setClient(c);
	    this.nextCard();
	}

    }
}
