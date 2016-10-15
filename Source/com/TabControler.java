import java.sql.*;

public class TabControler extends MainControler {

    public TabControler(String choix) throws SQLException {
	ClientModel c = this.getClient();
	if(choix=="Oui")
	    c.setChoixTablette(true);
	this.nextCard();
	    
    }
}
