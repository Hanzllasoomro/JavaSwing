import javax.swing.*;
import java.awt.*;

public class Graphics3 extends JFrame {

    Graphics3(){

        setSize(800,600);
        setTitle("Graphical Animation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        MyAnimation3 panel = new MyAnimation3(780,570);
        panel.setBackground(Color.PINK);
        add(panel);
    }
    public static void main(String[] args) { new Graphics3();  }
}
class MyAnimation3 extends JPanel{

    int x;
    int y;
    int fanWidth = 300;
    int fanHeight = 300;
    int centerX,centerY;
    int angle = 0;
    MyAnimation3(int w , int h){
        centerX = w/2;
        centerY = h/2;
        x = centerX - fanWidth/2;
        y = centerY - fanHeight/2;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.cyan);
        g.fillArc(x , y , fanWidth, fanHeight,angle,30);
        g.fillArc(x , y , fanWidth, fanHeight,angle + 120,30);
        g.fillArc(x , y , fanWidth, fanHeight,angle + 240,30);
        g.setColor(Color.RED);
        g.drawRect(centerX-2 , centerY , 6,2*fanHeight);
        angle = (angle - 30)%360;

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();

    }
}
