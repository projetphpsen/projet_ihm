import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ChoiceView extends JFrame {
    private JPanel top = new TopPanel();
    private JPanel progression = new ProgPanel(this);
    private JPanel siege = new SiegePanel();

    public ChoiceView() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(1000, 800));

        this.add(top, BorderLayout.NORTH);
        this.add(progression, BorderLayout.CENTER);
        this.add(siege, BorderLayout.SOUTH);
        setVisible(true);
    }
    public static void main(String[] args) {
        JFrame frame = new ChoiceView();
    }

}