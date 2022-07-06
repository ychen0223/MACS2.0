import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Main {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(); //creates frame
      		frame.setTitle("MACS GUI"); //title of frame
      		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application;
      		//DO_NOTHING_ON_CLOSE; they can not close out of gui
      		frame.setResizable(false); //dont allow frame from being resized
      		frame.setSize(420,420); //size of the frame
      		frame.setVisible(true); //make frame visible
      		frame.getContentPane().setBackground(new Color(153, 204, 255)); //color of background
      		//(new Color(0,0,0) range of 0 to 255 or (new Color(0xFFFFFF) or (Color.blue) 
            	//[153, 204, 255; baby blue]
      		
      		ImageIcon image = new ImageIcon(""); //create the image icon
            	frame.setIconImage(image.getImage()); //change icon of the frame

	}
}
