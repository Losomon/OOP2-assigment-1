// Java program to create three buttons
// with caption OK, SUBMIT, CANCEL
import java.awt.*;
class button{
button()  
{
    Frame f=new Frame();
    //button 1 create
    //Ok button
    Button b1=new Button("OK");
    b1.setBounds(100,101,50,50);
    f.add(b1);
    //button2 create
    //submit button
    Button b2=new Button("SUBMIT");
    b2.setBounds(150,50,60,60);
    f.add(b2);
    //button3 create
    //cancel button
    Button b3=new Button("CANCEL");
    b3.setBounds(100,150,80,50);
    f.add(b3);

    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
}
public static void main(String a[]) {
    new button(); 
}
}