// Java program using label (swing)
// to display the message “GFG WEB Site Click”
import javax.swing.JButton;
import javax.swing.JFrame;
class GFG{
    public static void main (String[] args)
    {
        //create instance of Jframe
        JFrame Frame=new JFrame();
//intance of jbutton
JButton button=new JButton("GFG WEB Site Click");
//x axis ,y axis position of button
button.setBounds(100,100,100,30);
//add button to frame
Frame.add(button);
//set size of frame
Frame.setSize(400,400);
//using no lay out manager
Frame.setLayout(null);
//make the frame visible
Frame.setVisible(true);
    }
}