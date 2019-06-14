import javax.swing.JFrame;
 
public class MMouse{
    public static void main(String[] args){
    JFrame frame = new JFrame("MMouse");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 600) ; 
MMouse r = new MMouse();
frame.add(r);
frame.setVisible(true);
     }
}