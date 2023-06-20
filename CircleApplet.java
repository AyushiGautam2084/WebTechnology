import java.applet.*;
import java.awt.*;

public class CircleApplet extends Applet {
    public void paint(Graphics g) {
        // set the color to black
        g.setColor(Color.BLACK);

        // draw the outer black circle
        g.fillOval(50, 50, 200, 200);

        // set the color to white
        g.setColor(Color.WHITE);

        // draw the inner white circle
        g.fillOval(100, 100, 100, 100);
    }
}
