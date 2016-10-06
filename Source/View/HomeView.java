import java.awt.*;
import javax.swing.*;

public class HomeView extends JFrame {
    JPanel top = new JPanel();
    JLabel crash = new JLabel();

    public HomeView() {
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        crash.setText("Crash Airlines");
        crash.setFont(new Font("Serif", Font.PLAIN, 60));
        top.add(crash);
        this.add(top, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        JFrame frame = new HomeView();
    }

}