import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class TabPanel extends JPanel implements ActionListener {
    Boolean sup = true;
    CheckboxGroup group = new CheckboxGroup();
    Checkbox oui = new Checkbox("Oui",true,group);
    Checkbox non = new Checkbox("Non",true,group);
    JButton submit = new JButton("Suivant");
    JLabel tab = new JLabel("<html>CrashAirLines propose un nouveau <br/>service de location de tablettes.<br/>Pour seulement 15€, une tablette vous sera<br/>prêtée pendant toute la durée de votre vol,<br/>vous donnant accès à notre vidéothèque<br/>composée de plusieurs centaines de films ! <br/>(Les 15€ devront être payés au moment de l'embarquement)<html/>");
    JLabel tabsup = new JLabel("<html>CrashAirLines propose un nouveau <br/>service de location de tablettes.<br/>Une tablette peux vous être prêtée<br/> pendant toute la durée de votre vol,<br/>vous donnant accès à notre vidéothèque<br/>composée de plusieurs centaines de films ! <br/>(Service gratuit pour la classe supérieur)<html/>");
    String tabChoisi;

    public TabPanel() {
        if(sup == true) {
            add(tabsup);
        }
        else{
            add(tab);
        }
        add(oui);
        add(non);
        add(submit);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            tabChoisi = group.getCurrent().toString();
            System.out.println(tabChoisi);
        }
    }
}