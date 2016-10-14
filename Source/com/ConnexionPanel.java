import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ConnexionPanel extends JPanel implements ActionListener{
    TitledBorder title = new TitledBorder("Connexion");
    JLabel name = new JLabel("Nom :");
    JLabel num = new JLabel("N° de réservation :");
    JTextField nameField = new JTextField(8);
    JTextField numField = new JTextField(8);
    JButton submit = new JButton("Entrer");
    String nomS;
    String numS;

    public ConnexionPanel() {
        addComponents();    
        submit.addActionListener(this);    
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            nomS = nameField.getText();
            numS = numField.getText();
	    try{
		ConnexionControler c = new ConnexionControler(nomS,numS);
	    }
	    catch(SQLException err){}
	    }
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
        this.add(name,contraintes);

        contraintes.gridx = 1;
        contraintes.gridy = 2;
        this.add(num,contraintes);

        contraintes.gridx = 2;
        contraintes.gridy = 1;
        this.add(nameField,contraintes);

        contraintes.gridx = 2;
        contraintes.gridy = 2;
        this.add(numField,contraintes);

        contraintes.gridx = 2;
        contraintes.gridy = 3;
        this.add(submit,contraintes);
    }
}
