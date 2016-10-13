import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FormPanel extends JPanel implements ActionListener{
    boolean sup = true;
    String[] range;
    String[] num;
    JButton submit = new JButton("Envoyer");

    public FormPanel() {
        setComboBoxesValues(this.sup);
        submit.addActionListener(this);    
        JComboBox combox = new JComboBox(num);
        JComboBox combo = new JComboBox(range);
        add(combo);
        add(combox);
        add(submit);
    }

    public void setComboBoxesValues(boolean sup) {
        if(sup == true) {
            num = new String[11];
            range = new String[3];
            range[0] = "A";
            range[1] = "C";
            range[2] = "E"; 

            for(int i = 0; i<11; i++) {
                    num[i] = Integer.toString(i);
                }
        }
        
        else if(sup == false) {
            num = new String[21];
            range = new String[5];
            range[0] = "A";
            range[1] = "B";
            range[2] = "C";
            range[3] = "D";
            range[4] = "E"; 

            for(int i = 0; i<22; i++) {
                if(i == 0) {
                    num[i] = Integer.toString(11);
                }

                else if(i+10<13) {
                    num[i] = Integer.toString(i+10);
                }
                else if(i+10>13) {
                    num[i-1] = Integer.toString(i+10);
                }
            }
        }

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            
        }
    }
}
