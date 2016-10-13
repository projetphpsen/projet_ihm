import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CardConnexion extends JPanel {
    private TopPanel top = new TopPanel();
    private ConnexionPanel conn = new ConnexionPanel();

    public CardConnexion() {
        setLayout(new BorderLayout());
        add(top, BorderLayout.NORTH);
        add(conn, BorderLayout.SOUTH);
    }

}