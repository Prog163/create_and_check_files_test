package com.zaychikov.tests.files_tests;

import org.junit.jupiter.api.Test;

import static com.zaychikov.tests.utils.Files.readTextFromPath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class TxtFileTest {

    private String filePath = "src/test/resources/txt_doc.txt";
    private String fileData = "I'm txt file";

    @Test
    void txtTest() throws Exception {
        String actualData = readTextFromPath(filePath);
        assertThat(actualData, containsString(fileData));
    }
}
