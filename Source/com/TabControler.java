import java.sql.*;

public class TabControler extends MainControler {

    public TabControler(String choix) throws SQLException {
	ClientModel c = this.getClient();
	if(choix=="Oui")
	    c.setChoixTablette(true);
	if(View.getSup()==true)
	    this.nextCard(5);
	else
	    this.nextCard(6);
    }
}
