import java.sql.*;

public class JournalControler extends MainControler {

    public JournalControler(){
    }

    
    public void setJournal(String choix) throws SQLException {
	ClientModel c = this.getClient();
	JournalModel jm = new JournalModel();
	int idChoix = jm.getIdDeJournal(choix);
	c.setChoixQuotidien(idChoix);
    }

    public void finChoix(){
	this.nextCard();
    }
}
