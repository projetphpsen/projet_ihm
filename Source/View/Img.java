import java.awt.*;

public class Img extends Component {
    public void paint(Graphics g) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage("moon.png");
        g.drawImage(img,0,0,this);
    }
}