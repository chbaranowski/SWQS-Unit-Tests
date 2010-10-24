package swqs.text;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class TextParserTest {

	TextParser parser;
	
	HashMap<String, Integer> expedtedWordCounts;
	
	@Before
	public void setup(){
		parser = new TextParser();
		expedtedWordCounts = new HashMap<String, Integer>();
	}
	
	@Test
	public void testTextWordCount_manyWords() throws Exception {
		// Beispiel String aus der Aufgabenstellung 
		String text = "Hallo hallo Beispiel TEXT für text";
		// Tabelle aus der Übung als MAP
		expedtedWordCounts.put("Hallo", 2);
		expedtedWordCounts.put("Beispiel", 1);
		expedtedWordCounts.put("Text", 2);
		expedtedWordCounts.put("Für", 1);
		// Test 
		assertEquals(expedtedWordCounts, parser.parseTextWordCount(text));
	}
	
	@Test
	public void testTextWordCount_OneWord() throws Exception {
		String text = "Hallo";
		expedtedWordCounts.put("Hallo", 1);
		assertEquals(expedtedWordCounts, parser.parseTextWordCount(text));
	}
	
	@Test
	public void testTextWordCount_EmptyText() throws Exception {
		String text = "  ";
		assertEquals(expedtedWordCounts, parser.parseTextWordCount(text));
	}
	
	@Test
	public void testTextWordCount_Null() throws Exception {
		String text = null;
		assertEquals(expedtedWordCounts, parser.parseTextWordCount(text));
	}
	
}
