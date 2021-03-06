package ie.iespto.wenhui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String [] arg) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
  
        try {
           // Apertura del fichero y creacion de BufferedReader para poder
           // hacer una lectura comoda (disponer del metodo readLine()).
           archivo = new File ("C:\\archivo.txt");
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);
  
           // Lectura del fichero
           String linea;
           while((linea=br.readLine())!=null)
              System.out.println(linea);
        }
        catch(Exception e){
           e.printStackTrace();
        }finally{
           // En el finally cerramos el fichero, para asegurarnos
           // que se cierra tanto si todo va bien como si salta 
           // una excepcion.
           try{                    
              if( null != fr ){   
                 fr.close();     
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        }
     }
}
