package net.sf.jabref.model.entry;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class BibtexInsertionTest {

    private BibEntry bibtexkey;


    @Before
    public void setUp() {
        bibtexkey = new BibEntry();
        bibtexkey.setType(BibtexEntryTypes.ARTICLE);
        // bibtexkey.setField("keywords","");
        bibtexkey.setChanged(false);
    }

    // SEQUENCIA DE TESTE PRÉ-EDICAO

    @Test
    public void acceptLessThan2CharactersTest() {
        String invalidKey = "z";

        bibtexkey.setField("bibtexkey", invalidKey);
        Map<String, String> BibtexFields = bibtexkey.getFieldMap();

        // assert equals test
        Assert.assertEquals(invalidKey, BibtexFields.get("bibtexkey"));
    }

    @Test
    public void accept1stCharacterNumberTest() {
        String invalidKey = "1z";

        bibtexkey.setField("bibtexkey", invalidKey);
        Map<String, String> BibtexFields = bibtexkey.getFieldMap();

        Assert.assertEquals(invalidKey, BibtexFields.get("bibtexkey"));
    }

    @Test
    public void acceptValidInsertionTest() {
        String invalidKey = "zAlcatel";

        bibtexkey.setField("bibtexkey", invalidKey);
        Map<String, String> BibtexFields = bibtexkey.getFieldMap();

        Assert.assertEquals(invalidKey, BibtexFields.get("bibtexkey"));
    }

    @Test
    public void acceptValidInsertionTest2() {
        String invalidKey = "Ultr4lite";

        bibtexkey.setField("bibtexkey", invalidKey);
        Map<String, String> BibtexFields = bibtexkey.getFieldMap();

        Assert.assertEquals(invalidKey, BibtexFields.get("bibtexkey"));
    }

    // SEQUENCIA DE TESTE PÓS-EDICAO
    @Test
    public void acceptValidInsertionTest3() {
        String invalidKey = "kudaelo";

        bibtexkey.setField("bibtexkey", invalidKey);
        Map<String, String> BibtexFields = bibtexkey.getFieldMap();

        Assert.assertEquals(invalidKey, BibtexFields.get("bibtexkey"));
    }

    @Test
    public void notAccept1stCharacterNumberTest() {
        String invalidKey = "0udaelo";

        bibtexkey.setField("bibtexkey", invalidKey);
        Map<String, String> BibtexFields = bibtexkey.getFieldMap();

        Assert.assertEquals(invalidKey, BibtexFields.get("bibtexkey"));
    }

}
