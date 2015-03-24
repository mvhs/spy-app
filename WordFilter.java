import java.util.List;
/**
 * Filters four-letter words from text
 * @author YOUR NAME HERE
 */
public class WordFilter {
	
	public WordFilter(String text) {
		// Creates a new WordFilter
	}
	
	public static List<String> getFourLetterWords() {
		// Return a list that contains "food", "taco", "pear"
		// and at least five of your own four letter words here
		// Remember that this is a school assignment!
		return null;
	}

    public List<String> getLog() {
        // Returns a list of all four letter words found in your text
        // Does not need to preserve the original capitalization
        // (though you may do so if you want to)
        // Should be listed in the order the words were replaced
        // If the same word is found multiple times,
        // it should be listed in the log multiple times
        return null;
    }

	public int findFour() {
		// Returns the number of four-letter words in text
		// Includes all capitalization variations
		return -1;
	}
	
	public String replaceFour(String wordToReplace, String symbols) {
		// Replaces the first instance of wordToReplace
        // in the text with symbols
		// Returns the updated text
		// Should return the unchanged text if wordToReplace does not exist in it
		return null;
	}
	
	public void printFilteredText() {
		// Prints the text filtered of all four-letter words
	}
}
