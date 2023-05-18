package com.zaychikov.tests.files_tests;

import org.junit.jupiter.api.Test;
import static com.zaychikov.tests.utils.Files.readTextFromPath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TxtFileTest {

    private String fileName = "txt_doc.txt";
    private String fileData = "I'm txt file";

    @Test
    void txtTest() throws Exception {
        String actualData = readTextFromPath(fileName);
        assertThat(actualData, containsString(fileData));
    }
}
