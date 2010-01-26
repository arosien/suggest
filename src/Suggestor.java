
public interface Suggestor {

  void add(String word, int frequency);

  /**
   * Return suggestions for a prefix. 
   * 
   * @param prefix
   * @return up to 3 of the most frequent words that begin with prefix, null if no suggestions available  
   */
  public String[] suggest(String prefix);

}
