import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class SiegePanel extends JPanel {
    private JLabel image = new JLabel(new ImageIcon("avion.jpg"));
    public SiegePanel() {
        this.add(image, BorderLayout.CENTER);
    }

}