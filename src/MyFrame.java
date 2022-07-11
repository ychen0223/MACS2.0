import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField Input;
    JTextField Display;
    database DB = new database();
    MyFrame() {
        this.setTitle("IRIS Mental Health");
        //this.getContentPane().setBackground(new Color(0, 51, 102));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame;
        this.setLayout(new BorderLayout());
        this.setSize(400,440);
        this.setResizable(false); //doesn't allow the frame to be resized
        JTextField Input = new JTextField();
        Input.setPreferredSize(new Dimension(300, 40));
        Input.setFont(new Font("Calibri", Font.PLAIN, 30));
        Input.setForeground(Color.black);

        ImageIcon image = new ImageIcon("macs-icon.png"); //create the image icon
        this.setIconImage(image.getImage()); //change icon of the frame

        JTextField Display = new JTextField();
        Display.setPreferredSize(new Dimension(400, 400));
        Display.setFont(new Font("Calibri", Font.PLAIN, 35));
        Display.setForeground(Color.black);
        Display.setEditable(false);

        JButton button = new JButton("Submit");
        button.setSize(100,40);
        button.addActionListener(this);
        this.add(Display, BorderLayout.NORTH);
        this.add(Input, BorderLayout.WEST);
        this.add(button,BorderLayout.EAST);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String Sentence = Input.getText();
            DB.InitialDataBase();
            String[] listofWord = chopdownthesentence(Sentence);
            for(String word:listofWord){
               // DB.PrintDFSearch(DB.graph);
            }
        }
    }

    public static String[] chopdownthesentence(String Sentence){
        String words[] = Sentence.split(" ");
        /*System.out.println("Number of words: " + words.length);
        for(int i = 0; i  <words.length; i++){
            System.out.println("word["+i+"] = " + words[i]);
        }*/
        return words;
    }
}

