package pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import com.spire.doc.Section;
import com.spire.doc.documents.BuiltinStyle;
import com.spire.doc.documents.Paragraph;
import com.spire.doc.documents.ParagraphStyle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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
        Document document = new Document();

        Section section = document.addSection();
//        PdfWriter.getInstance(document, new FileOutputStream(Nepali));
//        document.open();
//
        Paragraph p2 = section.addParagraph();
        p2.appendText("केदार केदार");
//        document.add(p2);
//        document.close();

        // Save the document
        document.saveToFile("results/fonts/Nepalii.docx", FileFormat.Docx);
    }
}


