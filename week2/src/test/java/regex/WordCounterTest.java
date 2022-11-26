package regex;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordCounterTest {

	MyFileReader fr1;
	MyFileReader fr2;
			
	@BeforeEach
	void setUp() throws Exception {
	
		// original war_and_peace.txt file
		fr1 = new MyFileReader("/Users/taihuynh/Developer/GitHub/upenn-java/week2/src/test/java/regex/war_and_peace.txt");
				
		// test file containing some text from war_and_peace.txt, with different characters and info
		fr2 = new MyFileReader("/Users/taihuynh/Developer/GitHub/upenn-java/week2/src/test/java/regex/test1.txt");
	}
	
	@Test
	void testWordCounter() {
		
		// Get clean lines from test1.txt
		ArrayList<String> linesSol = fr2.getCleanContent();
		
		// Create new Word Counter
		WordCounter wc = new WordCounter(linesSol);
		
		// Get map of words and counts 
		Map<String, Integer> counters = wc.getWordCounter();

		// Test the count of different words in map
		assertEquals(1, (int) counters.get("Gutenberg"));
		assertEquals(3, (int) counters.get("and"));
		
				
		// Get clean lines from war_and_peace.txt
		linesSol = fr1.getCleanContent();
		
		// Create new Word Counter
		wc = new WordCounter(linesSol);
		
		// Get map of words and counts 
		counters = wc.getWordCounter();

		// Test the count of different words in map
		int atCount = counters.get("at");
		System.out.println("atCount: " + atCount);
		assertTrue(atCount >= 3700 & atCount <= 4700);
		
		int inCount = counters.get("in");
		System.out.println("inCount: " + inCount);
		assertTrue(inCount >= 7700 & inCount <= 8700);
		
		assertEquals((int) counters.getOrDefault("adasdada", 0), 0);
		assertEquals((int) counters.getOrDefault(" ", 0), 0);
		
		
		// TODO write at least 3 additional test cases
		// Recommended: Test the counts of other words in the map. (Remember, words are case-sensitive.)
		ArrayList<String> wnpLines = fr1.getCleanContent();
		WordCounter wnpWc = new WordCounter(wnpLines);
		Map<String, Integer> wnpCounter = wnpWc.getWordCounter();

		int enlightenmentCount = wnpCounter.get("enlightenment");
		assertTrue(enlightenmentCount >= 1 && enlightenmentCount < 9);
		
		int capCatCount = wnpCounter.get("cat");
		assertTrue(capCatCount >= 1);

		int kittenCount = wnpCounter.get("kitten");
		assertTrue(kittenCount < 10);
	}
	
	@Test
	void testGetWordsOccuringMoreThan() {
		
		// Create new FileReader
		MyFileReader fr = new MyFileReader("/Users/taihuynh/Developer/GitHub/upenn-java/week2/src/test/java/regex/war_and_peace.txt");
		
		// Get clean lines from the File
		ArrayList<String> linesSol = fr.getCleanContent();
		
		// Create new Word Counter
		WordCounter wc = new WordCounter(linesSol);
		
		// Get words occurring more than 0 times
		ArrayList<String> ls1 = wc.getWordsOccuringMoreThan(0);
		System.out.println("ls1: " + ls1.size());
		assertTrue(ls1.size() >= 41400 & ls1.size() <= 42400);
		
		// Get words occurring more than 1000 times
		ArrayList<String> ls2 = wc.getWordsOccuringMoreThan(1000);
		System.out.println("ls2: " + ls2.size());
		assertTrue(ls2.size() >= 50 & ls2.size() <= 60);
		
		// Get words occurring more than 10000 times
		ArrayList<String> ls3 = wc.getWordsOccuringMoreThan(10000);
		System.out.println("ls3: " + ls3.size());
		assertTrue(ls3.size() >= 4 & ls3.size() <= 6);
		assertEquals(ls3.get(0), "a");
		assertEquals(ls3.get(1), "of");
		
		
		// TODO write at least 3 additional test cases 
		// Recommended: Test edge cases.  For example: Small numbers, large numbers, negative numbers, etc.
		ArrayList<String> small = wc.getWordsOccuringMoreThan(1);
		assertTrue(small.size() >= 1);
	
		ArrayList<String> large = wc.getWordsOccuringMoreThan(90000);
		assertTrue(large.size() == 0);

		ArrayList<String> neg = wc.getWordsOccuringMoreThan(-1);
		assertTrue(neg.size() >= 41400 & neg.size() <= 42400);

	}
	
	@Test
	void testGenerateWordCounts() {
		// lines to count words
		ArrayList<String> lines = new ArrayList<String>();
		lines.add("war and the");
		lines.add("war the peace peace");
		lines.add("the war the");
		
		Map<String, Integer> expectedCounts = new HashMap<String, Integer>();
		expectedCounts.put("war", 3);
		expectedCounts.put("and", 1);
		expectedCounts.put("the", 4);
		expectedCounts.put("peace", 2);
		
		// Create new Word Counter
		WordCounter wc = new WordCounter(lines);
		
		// Get and test map of words and counts
		assertEquals(expectedCounts, wc.getWordCounter());
		
		
		// TODO write at least 3 additional test cases
		// Recommended: Define other lists of lines and test the generated map of word counts
		ArrayList<String> lines2 = new ArrayList<String>();
		lines2.add("yin and yang");
		lines2.add("Jia you chen jia chen y jia");
		lines2.add("flameo goodman");

		Map<String, Integer> expectedCounts2 = new HashMap<String, Integer>();
		expectedCounts2.put("yin", 1);
		expectedCounts2.put("and", 1);
		expectedCounts2.put("yang", 1);
		expectedCounts2.put("Jia", 1);
		expectedCounts2.put("jia", 2);
		expectedCounts2.put("flameo", 1);

		WordCounter wc2 = new WordCounter(lines2);
		Map<String, Integer> counter2 = wc2.getWordCounter();

		assertEquals(expectedCounts2.get("flameo"), counter2.get("flameo"));
		assertEquals(expectedCounts2.get("yin"), counter2.get("yin"));
		assertEquals(expectedCounts2.get("juke"), counter2.get("juke"));
	}

}