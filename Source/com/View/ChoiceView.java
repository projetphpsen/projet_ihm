import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ChoiceView extends JFrame {
    private JPanel main = new MainPanel(this);
    public ChoiceView() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(1000, 800));
        add(main);
        //pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        JFrame frame = new ChoiceView();
    }

}