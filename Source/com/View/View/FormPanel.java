import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FormPanel extends JPanel implements ActionListener{
    boolean sup;
    String[] range = new String[6];
    String[] num = new String[32];
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
            range[1] = "A";
            range[2] = "C";
            range[3] = "E"; 
        }
        else if(sup == false) {
            range[1] = "A";
            range[2] = "B";
            range[3] = "C";
            range[4] = "D";
            range[5] = "E"; 

            for(int i = 11; i<32; i++) {
                if(i != 13) {
                    num[i] = Integer.toString(i);
                }
            }
        }

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            
        }
    }
}
