import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class EndPanel extends JPanel   {
    Boolean sup = true; 

    JLabel label = new JLabel("<html>Merci de votre réservation !<br/>Voici le récapitulatif :<html/>");
    JLabel siege = new JLabel("Votre siège :");
    JLabel menu = new JLabel("Votre menu :");
    JLabel tablette = new JLabel("Tablette :");
    JLabel journaux = new JLabel("Vos journaux :");

    JLabel choixSiege;// = new JLabel("Votre siège :");
    JLabel choixMenu;// = new JLabel("Votre menu :");
    JLabel choixTablette = new JLabel("Oui");
    JLabel choixJournaux;// = new JLabel("Vos journaux :");

    public EndPanel() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints contraintes = new GridBagConstraints();
        
        contraintes.gridx = 1;
        contraintes.gridy = 0;
        contraintes.gridheight = 1;
        contraintes.gridwidth = 1;
        contraintes.fill = GridBagConstraints.HORIZONTAL;
        contraintes.insets = new Insets(5,5,5,5);
        this.add(label,contraintes);

        contraintes.gridx = 1;
        contraintes.gridy = 1;
        this.add(siege,contraintes);
        contraintes.gridx = 2;
        //this.add(choixSiege,contraintes);

        contraintes.gridx = 1;
        contraintes.gridy = 2;
        this.add(menu,contraintes);
        contraintes.gridx = 2;
        //this.add(choixMenu,contraintes);

        contraintes.gridx = 1;
        contraintes.gridy = 3;
        this.add(tablette,contraintes);
        contraintes.gridx = 2;
        this.add(choixTablette,contraintes);

        if(sup == true) {

            contraintes.gridx = 1;
            contraintes.gridy = 4;
            this.add(journaux,contraintes);
            contraintes.gridx = 2;
            //this.add(choixJournaux,contraintes);

        }

    }
}