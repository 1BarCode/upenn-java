package arrayandarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {

	// declare myArrayAndArrayList which is the object for testing
	ArrayAndArrayList myArrayAndArrayList;
	
	@BeforeEach
	void setUp() throws Exception {
		// initialize myArrayAndArrayList for testing
		this.myArrayAndArrayList = new ArrayAndArrayList();
	}
	
	/**
	 * Test howMany method in ArrayAndArrayList.
	 */
	@Test
	void testHowMany() {
		// element in the array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));
		
		// TODO write at least 3 additional test cases 
		int[] array1 = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(1, this.myArrayAndArrayList.howMany(array1, 2));

		assertEquals(0, this.myArrayAndArrayList.howMany(array1, 10));

		int[] array2 = new int[0];
		assertEquals(0, this.myArrayAndArrayList.howMany(array2, 2));
	}
	
	/**
	 * Test findMax method in ArrayAndArrayList.
	 */
	@Test
	void testFindMax() {
		// findMax in an nonEmpty array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(9, this.myArrayAndArrayList.findMax(array));
		
		// TODO write at least 3 additional test cases 
		int[] array1 = {2, 4, 8, 12, 12, 4};
		assertEquals(12, this.myArrayAndArrayList.findMax(array1));

		int[] array2 = new int[0];
		assertEquals(-1, this.myArrayAndArrayList.findMax(array2));

		int[] array3 = {31, 1, 2, 3, 4, 5, 6 ,7 ,31};
		assertEquals(31, this.myArrayAndArrayList.findMax(array3));
	}

	/**
	 * Test maxArray method in ArrayAndArrayList.
	 */
	@Test
	void testMaxArray() {
		// test a valid array. 
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		ArrayList<Integer> testArrayList = new ArrayList<Integer>();
		testArrayList.add(9);
		assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));
		
		// TODO write at least 3 additional test cases 
		int[] test1 = {};
		assertEquals(null, myArrayAndArrayList.maxArray(test1));

		int[] test2 = {1, 13, 5, 7, 13, 1, 2, 3, 13, 4, 5};
		ArrayList<Integer> testArrayList2 = new ArrayList<Integer>();
		testArrayList2.add(13);
		testArrayList2.add(13);
		testArrayList2.add(13);
		assertEquals(testArrayList2, myArrayAndArrayList.maxArray(test2));

		int[] test3 = {2, 4, 8, 12, 12, 4};
		ArrayList<Integer> testArrayList3 = new ArrayList<Integer>();
		testArrayList3.add(12);
		testArrayList3.add(12);
		assertEquals(testArrayList3, myArrayAndArrayList.maxArray(test3));
	}

	/**
	 * Test swapZero method in ArrayAndArrayList.
	 */
	@Test
	void testSwapZero() {
		// test an array containing 0
		int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
		int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array);
		assertArrayEquals(testArray, array);
		
		
		// TODO write at least 3 additional test cases 
		int[] array1 = new int[0];
		this.myArrayAndArrayList.swapZero(array1);
		assertArrayEquals(array1, array1);

		int[] array2 = {1, 3, 5, 7, 9, 10};
		this.myArrayAndArrayList.swapZero(array2);
		assertArrayEquals(array2, array2);

		int[] array3 = {0, 1, 0, 2, 0, 3, 0, 5, 7, 0, 10};
		int[] testArray3 = {1, 2, 3, 5, 7, 10, 0, 0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array3);
		assertArrayEquals(testArray3, array3);
	}
}
