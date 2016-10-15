import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FormPanel extends JPanel implements ActionListener{
    boolean sup;
    JComboBox combox;
    JComboBox combo; 
    String[] range;
    String[] num;
    JButton submit = new JButton("Envoyer");
    String siegeChoisi;

    public FormPanel() {
        setComboBoxesItems(View.getSup());
        submit.addActionListener(this);
        combo = new JComboBox(num);
        combox = new JComboBox(range);
        add(combox);
        add(combo);
        add(submit);
    }

    public void setComboBoxesItems(boolean sup) {
        if(sup == true) {
            num = new String[10];
            range = new String[3];
            range[0] = "A";
            range[1] = "C";
            range[2] = "E"; 

            for(int i = 0; i<10; i++) {
                    num[i] = Integer.toString(i+1);
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
            siegeChoisi = combox.getSelectedItem().toString();
            siegeChoisi = siegeChoisi.concat(combo.getSelectedItem().toString());
	    try {
		new SiegeControler(siegeChoisi);
	    }
	    catch(SQLException err){
	    }
        }
    }
}
