import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class SiegePanel extends JPanel {
    
    public SiegePanel() {
        repaint();
        add(new Img());
    }
    public void paint(Graphics g) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage("moon.png");
        g.drawImage(img,200,200,this);
    }
}