import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class SiegePanel extends JPanel {
    private boolean superieur;
    private boolean[] rangeAsup = new boolean[10];
    private boolean[] rangeCsup = new boolean[10];
    private boolean[] rangeEsup = new boolean[10];
    private boolean[] rangeA = new boolean[20];
    private boolean[] rangeB = new boolean[20];
    private boolean[] rangeC = new boolean[20];
    private boolean[] rangeD = new boolean[20];
    private boolean[] rangeE = new boolean[20];

    public SiegePanel() {    }

    public void paintComponent(Graphics g) {
        g.drawRect(0,0,600,200);
        rangeAsup[3] = true;

        if(superieur == true) {
            for(int i = 0; i < 10; i++) {
                if(rangeCsup[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(10+i*60,10,38,38);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(10+i*60,10,38,38);
                }

                if(rangeEsup[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(10+i*60,50,38,38);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(10+i*60,50,38,38);
                }

                if(rangeAsup[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(10+i*60,152,38,38);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(10+i*60,152,38,38);
                }
            }
        }

        if(superieur == false) {
            for(int i = 0; i < 20; i++) {
                if(rangeC[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(8+i*30,10,20,20);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(8+i*30,10,20,20);
                }

                if(rangeD[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(8+i*30,35,20,20);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(8+i*30,35,20,20);
                }

                if(rangeE[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(8+i*30,60,20,20);
                }

                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(8+i*30,60,20,20);
                }

                if(rangeA[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(8+i*30,170,20,20);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(8+i*30,170,20,20);
                }

                if(rangeB[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(8+i*30,145,20,20);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(8+i*30,145,20,20);
                }
            }
        }
    }
}