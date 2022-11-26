package regex;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyFileReaderTest {
	
	MyFileReader myFileReader1;  
	MyFileReader myFileReader2;  
	MyFileReader myFileReader3;
	
	@BeforeEach
	void setUp() throws Exception {
		
		// original war_and_peace.txt file
		this.myFileReader1 = new MyFileReader("/Users/taihuynh/Developer/GitHub/upenn-java/week2/src/test/java/regex/war_and_peace.txt");   
		
		// test file containing some text from war_and_peace.txt, with different characters and info
		this.myFileReader2 = new MyFileReader("/Users/taihuynh/Developer/GitHub/upenn-java/week2/src/test/java/regex/test1.txt");
		
		// test file containing some text from war_and_peace.txt, with empty lines
		this.myFileReader3 = new MyFileReader("/Users/taihuynh/Developer/GitHub/upenn-java/week2/src/test/java/regex/test2.txt"); 
	}
	
	@Test
	public void testGetCleanContent() {
		
		// test original war_and_peace.txt file
		ArrayList<String> actual = myFileReader1.getCleanContent();
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Title: War and Peace");
		expected.add("Author: Leo Tolstoy");
		expected.add("Translators: Louise and Aylmer Maude");
		expected.add("Posting Date: January 10, 2009 [EBook #2600]");
		expected.add("Last Updated: January 21, 2019");
		expected.add("Language: English");
		expected.add("WAR AND PEACE");
		expected.add("By Leo Tolstoy/Tolstoi");
		
		// assert first 8 lines containing text
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
				
		// test shorter file
		actual = myFileReader2.getCleanContent();
		expected = new ArrayList<String>();
		expected.removeAll(expected);
		expected.add("Lines Other Info");
		expected.add("\"The Project Gutenberg EBook of War and Peace, by Leo Tolstoy\"");
		expected.add("Author: Leo Tolstoy");
		expected.add("CHAPTER I");
		expected.add("\"Well, Prince, so Genoa and Lucca are now just family estates of the\"");
		expected.add("\"Buonapartes. But I warn you, if you don't tell me that this means war,\"");
		expected.add("if you still try to defend the infamies and horrors perpetrated by that");
		assertEquals(expected, actual);
		
		// TODO write at least 1 additional test case using a different MyFileReader
		ArrayList<String> actual3 = myFileReader3.getCleanContent();
		ArrayList<String> expected3 = new ArrayList<String>();
		expected3.add("In the first case it was necessary to renounce the consciousness of an");
		expected3.add("unreal immobility in space and to recognize a motion we did not feel;");
		expected3.add("in the present case it is similarly necessary to renounce a freedom");
		expected3.add("\"that does not exist, and to recognize a dependence of which we are not\"");
		expected3.add("conscious.");
		expected3.add("Most people start at our Web site which has the main PG search facility:");
		expected3.add("http://www.gutenberg.org");
		assertEquals(actual3, expected3);
	}
	
}
