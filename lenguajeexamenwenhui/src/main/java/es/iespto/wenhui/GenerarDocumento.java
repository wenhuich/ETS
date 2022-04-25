package es.iespto.wenhui;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class GenerarDocumento {
    public static void generarDocumento() throws IOException{
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage(PDRectangle.A6);
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            /**
             * @author Wenhui 
             * aqui se añade el titulo al pdf
             */
                contentStream.beginText();
                contentStream.setFont(PDType1Font.TIMES_BOLD, 24);
                contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 52);
                contentStream.showText("Temperatura mes de abril");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(PDType1Font.TIMES_BOLD, 10);
                contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 52);
                contentStream.showText(ReadingTextFile.temperatura());
                contentStream.endText();

            /**
             * @author Wenhui 
             * aqui se añade la imagen al pdf
             */
                PDImageXObject image = PDImageXObject.createFromByteArray(document, App.class.getResourceAsStream("/java.png").readAllBytes(), "Java Logo");
                contentStream.drawImage(image, 20, 20, image.getWidth() / 3, image.getHeight() / 3);
            
            

            contentStream.close();

            document.save("document.pdf");
        }
        
    }
    public void titulo(String titulo){

    }
}