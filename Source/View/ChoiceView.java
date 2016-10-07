import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ChoiceView extends JFrame {
    JPanel top = new TopPanel();
    public ChoiceView() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension dimension = new Dimension(500, 300);
        setMinimumSize(dimension);

        this.add(top, BorderLayout.NORTH);
        setVisible(true);
    }
    public static void main(String[] args) {
        JFrame frame = new ChoiceView();
    }

}