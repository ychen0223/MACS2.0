import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(); //creates frame
      		frame.setTitle("MACS GUI"); //title of frame
      		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application;
      		//DO_NOTHING_ON_CLOSE; they can not close out of gui
      		frame.setResizable(false); //dont allow frame from being resized
      		frame.setSize(420,420); //size of the frame
      		frame.setVisible(true); //make frame visible
      		frame.getContentPane().setBackground(Color.blue);
	}
}
