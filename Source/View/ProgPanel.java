import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ProgPanel extends JPanel {
    private int progression = 0;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private JFrame frame;
    private Boolean sup = true;

    public ProgPanel(JFrame frame) {
        this.frame = frame;
        repaint();
    }

    public void paintComponent(Graphics g) {
        if(sup == true) {
            g.drawRect(0,0,((int)(frame.getWidth())/4),50);
            g.drawRect(((int)(frame.getWidth())/4),0,((int)(frame.getWidth())/4),50);
            g.drawRect(((int)(frame.getWidth())/2),0,((int)(frame.getWidth())/4),50);
            g.drawRect(((int)((frame.getWidth())*0.75)),0,((int)(frame.getWidth())/4),50);
            if(frame.getWidth() > 1500) {
                g.setFont(new Font("TimesRoman", Font.PLAIN, frame.getWidth()/50));
            }
            else{
                g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
            }
            g.drawString("Choix du siège",0,35);
            g.drawString("Choix du menu",frame.getWidth()/4,35);
            g.drawString("Tablette",frame.getWidth()/2,35);
            g.drawString("Quotidien",(int)(frame.getWidth()*0.75),35);
        
        }
    }
}