package com.zaychikov.tests;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class DocFileTest {

    private String fileName = "word_doc.docx";
    private String fileText = "This is my word doc!";

    @Test
    void docxFileTest() throws Exception {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream(fileName);
        XWPFWordExtractor docx = new XWPFWordExtractor(OPCPackage.open(stream));
        String parsedDocx = docx.getDocument().toString();
        assertThat(parsedDocx).contains(fileText);
    }
}
