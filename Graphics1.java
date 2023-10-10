import javax.swing.*;
import java.awt.*;

public class Graphics1 extends JFrame {

    Graphics1(){

        setSize(800,600);
        setTitle("Graphical Animation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        MyAnimation panel = new MyAnimation(780,560);
        panel.setBackground(Color.PINK);
        add(panel);
    }
    public static void main(String[] args) { new Graphics1();  }
}
class MyAnimation extends JPanel{

    int x ;
    int y ;
    int width = 100;
    int height = 50;
    int stepSize = 10;
    int max_X,max_y;
    MyAnimation(int w , int h){
        this.max_X = w;
        max_y = h;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.WHITE);
        g.fillRect(x,y,width,height);
        if(x + width > max_X || x<0)
            stepSize=-stepSize;

        x += stepSize;
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();

    }
}
