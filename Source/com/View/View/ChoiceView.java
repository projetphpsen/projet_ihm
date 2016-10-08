import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ChoiceView extends JFrame {
    private JPanel top = new TopPanel(this);
    private JPanel siege = new SiegePanel();

    public ChoiceView() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(1000, 800));
        /*setLayout(new GridBagLayout());

        GridBagConstraints contraintes = new GridBagConstraints();
        contraintes.fill = GridBagConstraints.HORIZONTAL;
        contraintes.gridx = 0;
        contraintes.gridy = 0;
        contraintes.weighty = 1;
        contraintes.anchor = GridBagConstraints.NORTHWEST;
        contraintes.insets = new Insets(5,5,5,5);
        this.add(top,contraintes);*/

        this.add(top, BorderLayout.NORTH);
        this.add(siege, BorderLayout.CENTER);


        setVisible(true);
    }
    public static void main(String[] args) {
        JFrame frame = new ChoiceView();
    }

}