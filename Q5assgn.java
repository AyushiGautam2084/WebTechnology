import java.applet.*;
import java.awt.*;

public class Q8assgn extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.yellow); 
        g.fillOval(130, 90, 30, 120);
        g.setColor(Color.pink); 
        g.fillOval(20, 180, 120, 30);
        g.setColor(Color.red); 
        g.fillOval(150, 180, 120, 30);
        g.setColor(Color.orange);
        g.fillOval(130, 200, 30, 120);
        g.setColor(Color.white);
        g.fillOval(135, 180, 30, 30);
    }
}
