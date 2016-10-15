import java.sql.*;

public class JournalControler extends MainControler {
    private JournalModel jm;
    
    public JournalControler(){
	jm = new JournalModel();
    }

    
    public void setJournal(String choix) throws SQLException {
	ClientModel c = MainControler.getClient();
	int idChoix = jm.getIdDeJournal(choix);
	if(jm.journalChoisi(idChoix,c.getId(),c.getIdVol())){
	    c.setChoixQuotidien(idChoix);
	}
    }

    public void finChoix(){
	this.nextCard(6);
    }
}
