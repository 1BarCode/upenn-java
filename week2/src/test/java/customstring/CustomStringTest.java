package customstring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomStringTest {

	//declare custom string for testing
	CustomString myCustomString;

	@BeforeEach
	public void setUp() throws Exception {
		//initialize custom string for testing
		this.myCustomString = new CustomString();
	}

	@Test
	void testGetString() {
		
		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("hello");
		assertEquals("hello", this.myCustomString.getString());
		
		// TODO write at least 3 additional test cases
		this.myCustomString.setString("");
		assertEquals("", this.myCustomString.getString());

		this.myCustomString.setString(null);
		assertNull(this.myCustomString.getString());

		this.myCustomString.setString("0");
		assertEquals("0", this.myCustomString.getString());	
	}
	
	@Test
	void testSetString() {
		
		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("Good-bye!");
		assertEquals("Good-bye!", this.myCustomString.getString());
		
		// TODO write at least 3 additional test cases 
		this.myCustomString.setString("");
		assertTrue(this.myCustomString.isSet);

		this.myCustomString.setString(null);
		assertFalse(this.myCustomString.isSet);

		this.myCustomString.setString("0");
		assertEquals("0", this.myCustomString.getString());
	}
	
	@Test
	void testRemove() {
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));
		
		// TODO write at least 3 additional test cases 
		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals(" luck nubers are 6, 8, and 19.", this.myCustomString.remove("my8"));

		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbers are 6, 8, and 19.", this.myCustomString.remove("RA6"));

		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals(" luck nubers are 6, 8, and 19.", this.myCustomString.remove("my.8"));
	}

	@Test
	void testReverse() {
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));
		
		// TODO write at least 3 additional test cases
		this.myCustomString.setString("ABC, xyz- 123.");
		assertEquals("Abc, XYZ- 123.", this.myCustomString.reverse("bcdxyz@3210-"));

		this.myCustomString.setString("123.");
		assertEquals("123.", this.myCustomString.reverse("bcdxyz@3210."));

		this.myCustomString.setString("");
		assertEquals("", this.myCustomString.reverse("bcdxyz@3210."));
	}

	@Test
	void testFilterLetters() {
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		// TODO write at least 3 additional test cases 
		this.myCustomString.setString("");
		assertEquals("", this.myCustomString.filterLetters('E', false));

		this.myCustomString.setString("Some real test.");
		assertEquals("a", this.myCustomString.filterLetters('E', true));

		this.myCustomString.setString("Some real test.");
		assertEquals("Som rl tst.", this.myCustomString.filterLetters('E', false));
	}

}
