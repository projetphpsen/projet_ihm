import java.sql.*;

public class EndControler extends MainControler {
        
    public EndControler(){
    }

    
    public void setCommentaire(String contenue) throws SQLException {
	ClientModel c = MainControler.getClient();
	String nomVol = c.getNomVol();
	String contenueActuel = c.getCommentaire(nomVol);
	c.setCommentaire(contenue,contenueActuel);
	this.nextCard();
    }

}
