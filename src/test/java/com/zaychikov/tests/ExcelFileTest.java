package com.zaychikov.tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import static com.codeborne.pdftest.assertj.Assertions.assertThat;

public class ExcelFileTest {

    String fileName = "excel_doc.xls";
    String cellNameValue = "Bob";
    String cellAgeValue = "Age";

    @Test
    void xlsFileTest() throws Exception {
        try (InputStream stream = getClass().getClassLoader().getResourceAsStream(fileName)) {
            XLS xlsFile = new XLS(stream);
            assertThat(xlsFile.excel.getSheetAt(0).getRow(1).getCell(0).getStringCellValue())
                    .isEqualTo(cellNameValue);
            assertThat(xlsFile.excel.getSheetAt(0).getRow(0).getCell(1).getStringCellValue())
                    .isEqualTo(cellAgeValue);
        }
    }
}
