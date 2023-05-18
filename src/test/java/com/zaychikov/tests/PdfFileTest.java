package com.zaychikov.tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class PdfFileTest {

    private String fileName = "pdf_doc.pdf";
    private String fileText = "This is my pdf doc!";

    @Test
    void pdfFileTest() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream(fileName);
        PDF pdfFile = new PDF(stream);
        assertThat(pdfFile.text).contains(fileText);
    }
}
