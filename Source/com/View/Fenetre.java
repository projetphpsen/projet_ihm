import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Fenetre extends JFrame {
    private JPanel siege = new TabPanel();
    public Fenetre() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(1000, 800));
        add(siege);
        setVisible(true);
    }
    public static void main(String[] args) {
        JFrame frame = new Fenetre();
    }

}