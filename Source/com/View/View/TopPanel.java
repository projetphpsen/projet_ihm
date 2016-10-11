import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class TopPanel extends JPanel {
    private JLabel crash = new JLabel();

    public TopPanel() {
        crash.setText("Crash Airlines");
        crash.setFont(new Font("Serif", Font.PLAIN, 60));
        this.add(crash, BorderLayout.NORTH);
        //crash.setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.red));
    }
}
