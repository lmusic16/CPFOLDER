import javax.swing.JFrame;

public class PurdueFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame("PurdueFrame"); 
                frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		  
                PurdueBoilermaker r = new PurdueBoilermaker(); 
	        frame.add(r);
		frame.setVisible(true);
	}
}
  