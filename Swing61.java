import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Swing61 {
    JFileChooser fileChooser;
    public Swing61(){

        JFrame frame = new JFrame("File Chooser");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        fileChooser = new JFileChooser("E:\\java project\\GUI and Graphics Case Study\\LecturePractices");
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setAcceptAllFileFilterUsed(true);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Only Text File(.txt)","txt");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Only Java File(.java)","java");
        FileNameExtensionFilter filter3 = new FileNameExtensionFilter("Only HTMl File(.html)","html");

        fileChooser.addChoosableFileFilter(filter);
        fileChooser.addChoosableFileFilter(filter2);
        fileChooser.addChoosableFileFilter(filter3);


        JPanel panel = new JPanel();
        frame.add(panel);

        JButton button1 = new JButton("Open");
        panel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equalsIgnoreCase("open")){
                    int selectedopt =  fileChooser.showDialog(null, "Open My File");
                    if(selectedopt == JFileChooser.APPROVE_OPTION){
                        File[] files = fileChooser.getSelectedFiles();
                        for (int i =0 ; i<files.length ; i++) {
                            File file = files[i];
                            System.out.println("\n Selected file is : " + file.getAbsolutePath());
                        }
                    }
                    else
                        System.out.println("User Cancelled the dialog");
                }
                else {
                    int selectedopt =  fileChooser.showSaveDialog(null);
                    if(selectedopt == JFileChooser.APPROVE_OPTION) {
                            System.out.println("Selected file is " + fileChooser.getSelectedFile().getAbsolutePath());
                        }
                    }
                    System.out.println("User Cancelled the dialog");
                }
        });

        JButton button2 = new JButton("Save");
        panel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equalsIgnoreCase("save")){
                    int selectedopt =  fileChooser.showDialog(null, "Save File");
                    if(selectedopt == JFileChooser.APPROVE_OPTION)
                        System.out.println("Selected file is " + fileChooser.getSelectedFile().getAbsolutePath());
                    else
                        System.out.println("User Cancelled the dialog");
                }
                else {
                    int selectedopt =  fileChooser.showSaveDialog(null);
                    if(selectedopt == JFileChooser.APPROVE_OPTION) {
                        System.out.println("Selected file is "+ fileChooser.getSelectedFile().getAbsolutePath());
                    }
                    System.out.println("User Cancelled the dialog");
                }
            }
        });


        frame.validate();
    }

    public static void main(String[] args) {
        Swing61 example = new Swing61();
    }
}
//    int selectedopt =  fileChooser.showDialog(null, "Open My File");
//        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

