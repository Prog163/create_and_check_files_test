package com.zaychikov.tests.files_tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.zaychikov.tests.utils.Files.readTextFromPath;
import static com.zaychikov.tests.utils.Zip.unzip;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ZipFileTest {
    @Test
    void zipWithPasswordTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/zip_doc_with_password.zip";
        String unzipFolderPath = "./src/test/resources/unzip";
        String zipPassword = "123";
        String unzipTxtFilePath = "./src/test/resources/unzip/readme.txt";
        String expectedData = "this is a readme.txt file!";

        unzip(zipFilePath, unzipFolderPath, zipPassword);
        String actualData = readTextFromPath(unzipTxtFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
