import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class View extends JFrame {
    CardConnexion connexion = new CardConnexion();
    CardSiege siege = new CardSiege(this);
    CardMenu menu = new CardMenu(this);
    CardTablette tablette = new CardTablette(this);
    CardJournal journal = new CardJournal(this);
    CardEnd end = new CardEnd();
    private static JPanel cardPanel = new JPanel();
    private static CardLayout cardLayout;
    public View() {
	setLayout(new FlowLayout());
	new ConnectionDB();
	MainControler.setView(this);
	cardLayout = new CardLayout();
	setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(1000, 800));
	cardPanel.setLayout(cardLayout);
	cardPanel.add(connexion);
	cardPanel.add(siege);
	cardPanel.add(menu);
	cardPanel.add(tablette);
	cardPanel.add(journal);
	cardPanel.add(end);
	add(cardPanel,BorderLayout.CENTER);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void next(){
	cardLayout.next(cardPanel);
    }

    
    
    public static void main(String[] agrs){
	new View();
    }
}
