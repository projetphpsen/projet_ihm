import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class View extends JFrame {
    /*CardConnexion connexion = new CardConnexion();
    CardSiege siege = new CardSiege(this);
    CardMenu menu = new CardMenu(this);
    CardTablette tablette = new CardTablette(this);
    CardJournal journal = new CardJournal(this);
    CardEnd end = new CardEnd();
    */
    private static JPanel cardPanel;
    private static CardLayout cardLayout;
    private static boolean sup;
    private static String[] place;
    
    public View() {
	place = new String[130];
     	setLayout(new BorderLayout());
	new ConnectionDB();
	MainControler.setView(this);
	cardPanel = new JPanel();
	cardLayout = new CardLayout();
	setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(1000, 800));
	cardPanel.setLayout(cardLayout);
	cardPanel.add(new CardConnexion());
	add(cardPanel,BorderLayout.CENTER);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
    }

    public void next(int i){
	if(i==2)
	    cardPanel.add(new CardSiege(this));
	if(i==3)
	    cardPanel.add(new CardMenu(this));
	if(i==4)
	    cardPanel.add(new CardTablette(this));
	if(i==5)
	    cardPanel.add(new CardJournal(this));
	if(i==6)
	    cardPanel.add(new CardEnd());

	cardLayout.next(cardPanel);
    }


    public static void setPlace(int idPlace) throws SQLException{
	idPlace=idPlace-1;
	place[idPlace] = MainControler.getPlace(idPlace);
    }
    
    public static String getPlace(int idPlace){
	return place[idPlace];
    }
    
    public static void setSup(boolean etat){
	sup = etat;
    }
    
    public static boolean getSup(){
	return sup;
    }
    
    public static void main(String[] agrs){
	new View();
    }
}
