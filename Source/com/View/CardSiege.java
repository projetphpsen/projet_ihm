import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CardSiege extends JPanel {
    private JFrame frame;
    private ProgPanel prog;
    private PlanePanel plane = new PlanePanel();
    private SiegePanel siege = new SiegePanel();
    private FormPanel formulaire = new FormPanel();


    public CardSiege(JFrame frame) {
        frame = frame;
        prog = new ProgPanel(frame);
        add(prog, BorderLayout.NORTH); 
        add(plane, BorderLayout.WEST);
        add(siege, BorderLayout.EAST);
        add(formulaire, BorderLayout.SOUTH);
    }

}