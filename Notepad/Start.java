import java.io.IOException;
import java.awt.*;


    
public class Start {
    public static void main(String[] args) throws IOException{

        //if (!GraphicsEnvironment.isHeadless()) {
            
            MyFrame okno = new MyFrame();
            Zapis zapis = new Zapis();
           
            zapis.zapisz("plik.txt", okno.text);
        //}


        

    }}