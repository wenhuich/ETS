package es.iespto.wenhui;
import java.io.*;
public class ReadingTextFile {
    public static void temperatura()throws IOException {
        File doc = new File("temperaturas-abril.txt");
        doc.createNewFile();
        FileReader freader = new FileReader(doc);
        char [] i = new char[1000];
        freader.read(i);
        for(char j : i)
        System.out.println(j);
        freader.close();
    }
}