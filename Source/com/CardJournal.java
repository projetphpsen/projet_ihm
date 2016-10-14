import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CardJournal extends JPanel {
    private JFrame frame;
    private ProgPanel prog;
    private JournalPanel journal = new JournalPanel();

    public CardJournal(JFrame frame) {
        frame = frame;
        prog = new ProgPanel(frame);
        setLayout(new BorderLayout());
        add(prog, BorderLayout.NORTH);
        add(journal, BorderLayout.CENTER);
    }

}