import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class HomeView extends JFrame {
    JPanel top = new JPanel();
    JLabel crash = new JLabel();
    JPanel connexion = new JPanel();

    public HomeView() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension dimension = new Dimension(500, 300);
        setMinimumSize(dimension);

        setTopPage();
        setConnectionForm();
        setVisible(true);

    }

    public static void main(String[] args) {
        JFrame frame = new HomeView();
    }

    public void setTopPage() {
        crash.setText("Crash Airlines");
        crash.setFont(new Font("Serif", Font.PLAIN, 60));
        top.add(crash);
        this.add(top, BorderLayout.NORTH);
        crash.setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.red));
    }

    public void setConnectionForm() {
        connexion.setLayout(new GridBagLayout());

        TitledBorder title = new TitledBorder("Connexion");
        title = BorderFactory.createTitledBorder("Connexion");
        connexion.setBorder(title);

        JLabel name = new JLabel("Nom :");
        JLabel num = new JLabel("N° de réservation :");
        JTextField nameField = new JTextField(8);
        JTextField numField = new JTextField(8);
        JButton submit = new JButton("Entrer");
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
        connexion.add(num,contraintes);

        contraintes.gridx = 2;
        contraintes.gridy = 1;
        connexion.add(nameField,contraintes);

        contraintes.gridx = 2;
        contraintes.gridy = 2;
        connexion.add(numField,contraintes);

        contraintes.gridx = 2;
        contraintes.gridy = 3;
        connexion.add(submit,contraintes);

        this.add(connexion, BorderLayout.CENTER);
        
        

    }

}