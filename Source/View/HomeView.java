import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class HomeView extends JFrame {
    JPanel top = new TopPanel();
    JPanel connexion = new ConnexionPanel();

    public HomeView() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension dimension = new Dimension(1000, 800);
        setMinimumSize(dimension);

        this.add(connexion, BorderLayout.CENTER);
        this.add(top, BorderLayout.NORTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new HomeView();
    }
}