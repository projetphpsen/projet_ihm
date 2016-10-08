import java.awt.*;
import javax.swing.*;

public class Img extends JComponent {
    public void paintComponent(Graphics g) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage("avion.jpg");
        g.drawImage(img,0,0,this);
    }
}