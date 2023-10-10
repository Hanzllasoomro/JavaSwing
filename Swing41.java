import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Swing41 extends JFrame implements ChangeListener{
    JSpinner s1,s2,s3;
    SpinnerModel day,month,year;
    JLabel label;
    String[] m = {"January","February","March","April","May","june","July",
                        "August","September","October","November","December"};
    Swing41(){

        setTitle("JSpinner Programe");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        String today = String.valueOf(java.time.Year.now());
        int y = Integer.parseInt(today);

        day = new SpinnerNumberModel(1,1,31,1);
        month = new SpinnerListModel(m);
        year = new SpinnerNumberModel(y,y-100,y,1 );

        s1 = new JSpinner(day);
        s2 = new JSpinner(month);
        s3 = new JSpinner(year);

        s1.setBounds(100,20,100,50);
        s2.setBounds(100,100,100,50);
        s3.setBounds(100,200,100,50);

        add(s1);
        add(s2);
        add(s3);

        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);

        label = new JLabel();
        label.setBounds(100,300,200,20);
        setDOB();
        add(label);

        setVisible(true);
        validate();
    }
    public void setDOB(){
        int Date = (int) s1.getValue();
        String Month = (String) s2.getValue();
        int Year = (int) s3.getValue();

        label.setText("Date of Birth is:"+Date+"-"+Month+"-"+Year);
    }
    public static void main(String[] args) { new Swing41(); }

    @Override
    public void stateChanged(ChangeEvent e) {
        setDOB();
    }
}
