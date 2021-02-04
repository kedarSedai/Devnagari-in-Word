package pdf;

//Need to import itextpdf for pdf file
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

//Need to import spire libraries file for the word file
import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import com.spire.doc.Section;
import com.spire.doc.documents.BuiltinStyle;
import com.spire.doc.documents.Paragraph;
import com.spire.doc.documents.ParagraphStyle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static sun.plugin.javascript.navig.JSType.Document;

/**
 * Created by kedar on 2/3/2021.
 */
public class pdf {
    public static final String Nepali = "results/fonts/nepali.pdf";
    //public static final String FONT = "resources/fonts/FreeSans.ttf";
    public static final String FONT = "Devanagari/Lohit-Devanagari.ttf";

    public static void main(String[] args) throws IOException, DocumentException {
        File file = new File(Nepali);
        file.getParentFile().mkdirs();
        new pdf().createPdf(Nepali);
    }

    public void createPdf(String Nepali) throws IOException, DocumentException {

        //For the PDF file
//        Document document = new Document();
//        try
//        {
//            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(Hello.pdf));
//            document.open();
//            document.add(new Paragraph("केदार केदार");
//            document.close();
//            writer.close();
//        } catch (DocumentException e)
//        {
//            e.printStackTrace();
//        } catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//    }


        //For the Document file.
        Document document = new Document();

        Section section = document.addSection();

        Paragraph p2 = section.addParagraph();
        p2.appendText("केदार केदार");

        // Save the document
        document.saveToFile("results/fonts/Nepalii.docx", FileFormat.Docx);
    }
}


