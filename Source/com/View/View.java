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

    public View() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(1000, 800));
        add(end, BorderLayout.CENTER);
        //pack();
        setVisible(true);
    }
}