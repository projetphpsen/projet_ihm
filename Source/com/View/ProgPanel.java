import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ProgPanel extends JPanel {
    private int progression = 2;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private JFrame frame;
    private Boolean sup = true;

    public ProgPanel(JFrame frame) {
        this.frame = frame;
        setPreferredSize(new Dimension(1920,200));
        repaint();
    }

    public void setProgression() {
        progression++;
    }

    public void paintComponent(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.PLAIN, 60));
        g.drawString("Crash Airlines",(int)(frame.getWidth()*(0.350)),50);

        if(sup == true) {
            g.drawRect(0,100,((int)(frame.getWidth())/4),50);
            g.drawRect(((int)(frame.getWidth())/4),100,((int)(frame.getWidth())/4),50);
            g.drawRect(((int)(frame.getWidth())/2),100,((int)(frame.getWidth())/4),50);
            g.drawRect(((int)((frame.getWidth())*0.75)),100,((int)(frame.getWidth())/4),50);

            if(frame.getWidth() > 1500) {
                g.setFont(new Font("TimesRoman", Font.PLAIN, frame.getWidth()/50));
            }
            else{
                g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
            }

            if(progression == 1) {
                g.setColor(Color.GREEN);
                g.fillRect(0,100,((int)(frame.getWidth())/4),50);
            }

            if(progression == 2) {
                g.setColor(Color.GREEN);
                g.fillRect(0,100,((int)(frame.getWidth())/4),50);
                g.fillRect(((int)(frame.getWidth())/4),100,((int)(frame.getWidth())/4),50);
            }

            if(progression == 3) {
                g.setColor(Color.GREEN);
                g.fillRect(0,100,((int)(frame.getWidth())/4),50);
                g.fillRect(((int)(frame.getWidth())/4),100,((int)(frame.getWidth())/4),50);
                g.fillRect(((int)(frame.getWidth())/2),100,((int)(frame.getWidth())/4),50);
            }

            if(progression == 4) {
                g.setColor(Color.GREEN);
                g.fillRect(0,100,((int)(frame.getWidth())/4),50);
                g.fillRect(((int)(frame.getWidth())/4),100,((int)(frame.getWidth())/4),50);
                g.fillRect(((int)(frame.getWidth())/2),100,((int)(frame.getWidth())/4),50);
                g.fillRect(((int)((frame.getWidth())*0.75)),100,((int)(frame.getWidth())/4),50);
            }
            g.setColor(Color.BLACK);
            g.drawString("Choix du siège",0,135);
            g.drawString("Choix du menu",frame.getWidth()/4,135);
            g.drawString("Tablette",frame.getWidth()/2,135);
            g.drawString("Quotidien",(int)(frame.getWidth()*0.75),135);
        
        }

        if(sup == false) {
            g.drawRect(0,100,((int)((frame.getWidth())*(0.666))),50);
            g.drawRect(((int)((frame.getWidth())*(0.333))),100,((int)((frame.getWidth())*(0.333))),50);
            g.drawRect(((int)((frame.getWidth())*(0.666))),100,((int)((frame.getWidth())*(0.333))),50);

            if(frame.getWidth() > 1500) {
                g.setFont(new Font("TimesRoman", Font.PLAIN, frame.getWidth()/50));
            }
            else{
                g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
            }

            if(progression == 1) {
                g.setColor(Color.GREEN);
                g.fillRect(0,100,((int)((frame.getWidth())*(0.666))),50);
            }

            if(progression == 2) {
                g.setColor(Color.GREEN);
                g.fillRect(0,100,((int)((frame.getWidth())*(0.666))),50);
                g.fillRect(((int)((frame.getWidth())*(0.333))),100,((int)((frame.getWidth())*(0.333))),50);
            }

            if(progression == 3) {
                g.setColor(Color.GREEN);
                g.fillRect(0,100,((int)((frame.getWidth())*(0.666))),50);
                g.fillRect(((int)((frame.getWidth())*(0.333))),100,((int)((frame.getWidth())*(0.333))),50);
                g.fillRect(((int)((frame.getWidth())*(0.666))),100,((int)((frame.getWidth())*(0.333))),50);
            }

            g.setColor(Color.BLACK);
            g.drawString("Choix du siège",0,135);
            g.drawString("Choix du menu",(int)(frame.getWidth()*(0.333)),135);
            g.drawString("Tablette",(int)(frame.getWidth()*(0.666)),135);
        
        }
    }
}