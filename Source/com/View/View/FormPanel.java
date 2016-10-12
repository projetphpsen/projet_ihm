import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class FormPanel extends JPanel implements ActionListener{
    String[] range = {"A", "C", "E"};
    JComboBox combo = new JComboBox(range);
    String[] num = new String[11];
    JButton submit = new JButton("Envoyer");

    public FormPanel() {
        submit.addActionListener(this);
        add(combo);
        for(int i = 1; i<11; i++) {
            num[i] = Integer.toString(i);
        }
        JComboBox combox = new JComboBox(num);
        add(combox);
        add(submit);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            
        }
}
