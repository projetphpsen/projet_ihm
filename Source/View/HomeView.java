import java.awt.*;
import javax.swing.*;

public class HomeView extends JFrame {
    JPanel top = new JPanel();
    JLabel crash = new JLabel();
    JPanel connexion = new JPanel();

    public HomeView() {
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setTopPage();
        setConnectionFrom();

    }

    public static void main(String[] args) {
        JFrame frame = new HomeView();
    }

    public void setTopPage() {
        crash.setText("Crash Airlines");
        crash.setFont(new Font("Serif", Font.PLAIN, 60));
        top.add(crash);
        this.add(top, BorderLayout.NORTH);
    }

    public void setConnectionFrom() {
        connexion.setLayout(new GridBagLayout());
        JLabel name = new JLabel("Nom :");
        JLabel num = new JLabel("Numero de réservation :");
        JTextField nameField = new JTextField();
        JTextField numField = new JTextField();
        GridBagConstraints contraintes = new GridBagConstraints();
        
        contraintes.gridx = 1;
        contraintes.gridy = 1;
        contraintes.gridheight = 1;
        contraintes.gridwidth = 1;
        contraintes.fill = GridBagConstraints.HORIZONTAL;
        contraintes.insets = new Insets(5,5,5,5);
        connexion.add(name,contraintes);

        contraintes.gridx = 1;
        contraintes.gridy = 2;
        contraintes.gridheight = 1;
        contraintes.gridwidth = 1;
        contraintes.insets = new Insets(5,5,5,5);
        connexion.add(num,contraintes);

        contraintes.gridx = 2;
        contraintes.gridy = 1;
        contraintes.gridheight = 1;
        contraintes.gridwidth = 1;
        contraintes.insets = new Insets(5,5,5,5);
        connexion.add(nameField,contraintes);

        contraintes.gridx = 2;
        contraintes.gridy = 2;
        contraintes.gridheight = 1;
        contraintes.gridwidth = 1;
        contraintes.insets = new Insets(5,5,5,5);
        connexion.add(numField,contraintes);

        this.add(connexion);

    }

}