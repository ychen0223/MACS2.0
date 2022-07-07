import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField Input;
    JTextField Display;
    MyFrame(database DB) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame;
        this.setLayout(new BorderLayout());
        this.setSize(400,440);
        this.setResizable(false); //doesn't allow the frame to be resized
        JTextField Input = new JTextField();
        Input.setPreferredSize(new Dimension(300, 40));
        Input.setFont(new Font("Consolas", Font.PLAIN, 35));
        Input.setForeground(Color.black);

        JTextField Display = new JTextField();
        Display.setPreferredSize(new Dimension(400, 400));
        Display.setFont(new Font("Consolas", Font.PLAIN, 35));
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
            Input.getText();
           // DB.InitialDataBase();
           // DB.PrintBFSearch(DB.graph);
        }
    }
}

