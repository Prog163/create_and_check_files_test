package com.zaychikov.tests.files_tests;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import static com.codeborne.pdftest.assertj.Assertions.assertThat;

public class DocFileTest {

    private String fileName = "word_doc.docx";
    private String fileText = "This is my word doc!";

    @Test
    void docxFileTest() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream(fileName);
        XWPFDocument docx = new XWPFDocument(stream);
        String parsedDocx = docx.getDocument().toString();
        assertThat(parsedDocx).contains(fileText);
    }
}
