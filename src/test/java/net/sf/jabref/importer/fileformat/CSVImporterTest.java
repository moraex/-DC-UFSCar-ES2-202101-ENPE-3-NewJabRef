package net.sf.jabref.importer.fileformat;

import java.io.IOException;
import java.io.InputStream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CSVImporterTest {

    private CSVImporter importer;


    @Before
    public void setUp() {
        importer = new CSVImporter();
    }

    @Test
    public void testIsRecognizedFormat() throws IOException {
        try (InputStream stream = BibtexImporterTest.class.getResourceAsStream("CSVImporterTest.csv")) {
            assertTrue(importer.isRecognizedFormat(stream));
        }
    }

    @Test
    public void testGetFormatName() {
        assertEquals("CSV", importer.getFormatName());
    }

    @Test
    public void testGetExtensions() {
        assertEquals("csv", importer.getExtensions());
    }
}