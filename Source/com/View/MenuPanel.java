import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class MenuPanel extends JPanel implements ActionListener {
    String[] range = {"Classic", "Végétarien", "Sans gluten"};
    JComboBox combo = new JComboBox(range);
    JLabel menu = new JLabel("Choisissez votre menu :");
    JButton submit = new JButton("Suivant");

    public MenuPanel() {
        submit.addActionListener(this);
        addComponents();
    }

    public void addComponents() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints contraintes = new GridBagConstraints();
        
        contraintes.gridx = 1;
        contraintes.gridy = 1;
        contraintes.gridheight = 1;
        contraintes.gridwidth = 1;
        contraintes.fill = GridBagConstraints.HORIZONTAL;
        contraintes.insets = new Insets(5,5,5,5);
        this.add(menu,contraintes);

        contraintes.gridx = 1;
        contraintes.gridy = 2;
        this.add(combo,contraintes);

        contraintes.gridx = 2;
        contraintes.gridy = 1;
        this.add(combo,contraintes);

        contraintes.gridx = 2;
        contraintes.gridy = 3;
        this.add(submit,contraintes);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            
        }
    }
}