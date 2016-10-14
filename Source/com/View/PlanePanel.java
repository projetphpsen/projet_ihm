import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class PlanePanel extends JPanel {
    private JLabel image = new JLabel(new ImageIcon("avion.jpg"));
    public PlanePanel() {
        setPreferredSize(new Dimension(900,500));
        this.add(image);
    }
}