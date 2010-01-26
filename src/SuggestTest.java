import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class SuggestTest {

  Suggestor suggest;
  
  @Before
  public void before() {
    suggest = newSuggestor();
    suggest.add("ads", 512);
    suggest.add("adam", 232);
    suggest.add("addition", 712);
    suggest.add("aardvark", 1612);
    suggest.add("advert", 2);
    suggest.add("adidas", 1234);
    // TODO: Add more words; use an external dictionary.
  }
  
  Suggestor newSuggestor() {
    // TODO: Implement your factory for a Suggestor.
    throw new UnsupportedOperationException("Dang, the applicant didn't implement newSuggestor()!");
  }

  @Test 
  public void z() {
    String[] suggestions = suggest.suggest("z");
    assertNull(suggestions);
  }
  
  @Test
  public void ad() {
    String[] suggestions = suggest.suggest("ad");
    assertNotNull(suggestions);
    assertEquals(3, suggestions.length);
    assertArrayEquals(
        new String[] { "adidas", "addition", "ads"}, 
        suggestions);
  }
  
  // TODO: Write more tests!
}
