import java.sql.*;

public class MenuControler extends MainControler {

    public MenuControler(String menu) throws SQLException {
	ClientModel c = this.getClient();
	PlaceModel p = new PlaceModel();
	c.setMenu(menu);
	this.nextCard(4);
	    
    }
}


