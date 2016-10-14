import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CardEnd extends JPanel {
    private TopPanel top = new TopPanel();
    private EndPanel end = new EndPanel();

    public CardEnd() {
        setLayout(new BorderLayout());
        add(top, BorderLayout.NORTH);
        add(end, BorderLayout.CENTER);
    }

}