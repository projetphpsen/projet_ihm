import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class TopPanel extends JPanel {
    private JLabel crash = new JLabel();
    private int progression = 0;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private JFrame frame;
    private Boolean sup = true;

    public TopPanel(JFrame frame) {
        crash.setText("Crash Airlines");
        crash.setFont(new Font("Serif", Font.PLAIN, 60));
        this.add(crash);
        crash.setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.red));
        this.frame = frame;
    }

    public void paintComponent(Graphics g) {
        if(sup == true) {
            g.drawRect(0,90,((int)(frame.getWidth())/4),100);
            g.drawRect(((int)(frame.getWidth())/4),90,((int)(frame.getWidth())/4),100);
            g.drawRect(((int)(frame.getWidth())/2),90,((int)(frame.getWidth())/4),100);
            g.drawRect(((int)((frame.getWidth())*0.75)),90,((int)(frame.getWidth())/4),100);
            if(frame.getWidth() > 1500) {
                g.setFont(new Font("TimesRoman", Font.PLAIN, frame.getWidth()/50));
            }
            else{
                g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
            }
            g.drawString("Choix du siège",0,155);
            g.drawString("Choix du menu",frame.getWidth()/4,155);
            g.drawString("Tablette",frame.getWidth()/2,155);
            g.drawString("Quotidien",(int)(frame.getWidth()*0.75),155);
        
        }
    }
}
