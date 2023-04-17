
import java.io.FileWriter;
import java.io.IOException;

class Zapis{



    public void zapisz(String path, String text) throws IOException{

        FileWriter Plik = null;

        try{
            Plik = new FileWriter(path);
            Plik.write(text);
        }


        finally{
            if (Plik != null){
                Plik.close();
            }
        }
    }

    
}
