import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class MainPanel extends JPanel {
    JFrame view;
    private JPanel top = new TopPanel();
    private JPanel prog;
    private JPanel siege = new SiegePanel();

    public MainPanel(JFrame frame) {
        view = frame;
        prog = new ProgPanel(view);
        SpringLayout layout = new SpringLayout();
        setLayout(layout); 
        //this.add(top, BorderLayout.NORTH);
        this.add(prog, BorderLayout.CENTER);
        //this.add(siege, BorderLayout.SOUTH);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, prog, 5,SpringLayout.HORIZONTAL_CENTER,this);
        //layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, prog, 5,SpringLayout.VERTICAL_CENTER,this);

        //layout.putConstraint(SpringLayout.NORTH, top, 10, SpringLayout.WEST, contentPane);
        //layout.putConstraint(SpringLayout.NORTH, left, 25, SpringLayout.NORTH, contentPane);
        //layout.putConstraint(SpringLayout.NORTH, right, 25, SpringLayout.NORTH, contentPane);
        //layout.putConstraint(SpringLayout.WEST, right, 20, SpringLayout.EAST, left);
    }
}