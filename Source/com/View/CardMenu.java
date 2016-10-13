import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CardMenu extends JPanel {
    private JFrame frame;
    private ProgPanel prog;
    private MenuPanel menu = new MenuPanel();

    public CardMenu(JFrame frame) {
        frame = frame;
        prog = new ProgPanel(frame);
        setLayout(new BorderLayout());
        add(prog, BorderLayout.NORTH);
        add(menu, BorderLayout.CENTER);
    }

}