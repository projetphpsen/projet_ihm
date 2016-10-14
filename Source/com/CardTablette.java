import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CardTablette extends JPanel {
    private JFrame frame;
    private ProgPanel prog;
    private TabPanel tab = new TabPanel();

    public CardTablette(JFrame frame) {
        frame = frame;
        prog = new ProgPanel(frame);
        setLayout(new BorderLayout());
        add(prog, BorderLayout.NORTH);
        add(tab, BorderLayout.CENTER);
    }

}