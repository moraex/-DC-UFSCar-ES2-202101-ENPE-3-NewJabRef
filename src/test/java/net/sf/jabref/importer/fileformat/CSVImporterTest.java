package net.sf.jabref.importer.fileformat;

import java.io.IOException;
import java.io.InputStream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * This class tests the BibtexImporter.
 * That importer is only used for --importToOpen, which is currently untested
 * <p>
 * TODO:
 * 1. Add test for --importToOpen
 * 2. Move these tests to the code opening a bibtex file
 */
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
    public void testImportEntries() throws IOException {

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