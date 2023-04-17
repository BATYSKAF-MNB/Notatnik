import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {

    String text = null;


    public void myFrame(){

        JTextField poleText = new JTextField("text");
        String text = poleText.getText(); 
    }
    
    public MyFrame(){
        super("hello");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //myFrame();

    }

    }