import javax.swing.*;
import java.awt.*;

public class Graphics2 extends JFrame {

    Graphics2(){

        setSize(800,600);
        setTitle("Graphical Animation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        MyAnimation2 panel = new MyAnimation2(780,550);
        panel.setBackground(Color.PINK);
        add(panel);
    }
    public static void main(String[] args) { new Graphics2();  }
}
class MyAnimation2 extends JPanel{
    int x = 0;
    int y = 0;
    int max_x,max_y;
    int ballWidth = 50;
    int ballHeight = 50;
    int speedX = 10;
    int speedy = 10;
    MyAnimation2(int w , int h){
        max_x = w - ballHeight ;
        max_y = h - ballHeight ;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.red);
        g.fillOval(x,y,ballWidth,ballHeight);
        if(x>max_x || x<0)
            speedX=-speedX;
        if(y>max_y || y<0)
            speedy=-speedy;
        x=x+speedX;
        y=y+speedy;

        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        repaint();
    }
}
