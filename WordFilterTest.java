import java.io.*;
import java.util.List;

/**
 * Automatic tests run on WordFilter
 * You do not need to modify this file.
 * Using `targets check` or the web console
 * to run the tests included here.
 * 
 * These tests are basic. Passing them does
 * not guarantee that your code works or that
 * you will receive full credit on the assignment.
 * @author Jack Thakar
 */
public class WordFilterTest {
	public static void main(String[] args) {
		//getFourLetterWords
		List<String> words = WordFilter.getFourLetterWords();
		if (words == null) {
			error("getFourLetterWords");
		} else if(words.size()<8||!words.contains("food")||
				!words.contains("pear")||words.contains("taco")) {
			error("getFourLetterWords");
		}
		//findFour
		WordFilter wf = new WordFilter("Hello a food pear taco testing Food PEAR tAcO");
		WordFilter wf2 = new WordFilter("A sentence is perfect pears tacos");
		if (wf.findFour() != 6 || wf2.findFour() != 0) {
			error("findFour");
		}
		//replaceFour
		String resultA = wf.replaceFour("food", "$%#@$");
		wf.replaceFour("taco", "****");
		String resultB = wf.replaceFour("food", "****");
		wf.replaceFour("pear", "****");
		wf.replaceFour("pear", "****");
		String resultC = wf.replaceFour("taco", "****");
		String expectedA = "Hello a $%#@$ pear taco testing Food PEAR tAcO";
		String expectedB = "Hello a $%#@$ pear **** testing **** PEAR tAcO";
		String expectedC = "Hello a $%#@$ **** **** testing **** **** ****";
		if (!expectedA.equals(resultA)||!expectedB.equals(resultB)||!expectedC.equals(resultC)) {
			error("replaceFour");
		}
        //getLog
        List<String> log = wf.getLog();
        if(log.size() != 6 || !log.get(0).toLowerCase().equals("food") ||
            !log.get(5).toLowerCase.equals("taco")){
            error("getLog");
        }
		//printFilteredText
		PrintStream stdout = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));
		String text = "food pear taco testing 1 2 3 Food PEAR tAcO";
		WordFilter filter = new WordFilter(text);
		filter.printFilteredText();
		String filtered = baos.toString();
		System.setOut(stdout);
		String expected = "**** **** **** testing 1 2 3 **** **** ****";
		if (!expected.equals(filtered.trim())) {
			error("printFilteredText");
		}
	}
	
	private static boolean firstError = true;
	
	private static void error(String err){
		if(firstError){
			firstError = false;
			System.out.println("\nErrors With:");
		}
		System.out.println(err);
	}
}
