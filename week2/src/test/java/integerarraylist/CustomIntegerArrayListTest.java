package integerarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import integerarraylist.CustomIntegerArrayList;

class CustomIntegerArrayListTest {

	@Test
	void testGetArrayList() {
		
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst1, arr1.getArrayList());

		ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
		arr4Elements.add(100);
		arr4Elements.add(200);
		arr4Elements.add(500);
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(100);
		lst4.add(200);
		lst4.add(500);

		assertEquals(lst4, arr4.getArrayList());
		
		// TODO write at least 3 additional test cases 
		lst1.add(10);
		arr1.add(10);
		assertEquals(lst1, arr1.getArrayList());

		lst4.add(1, 1000);
		arr4.add(1, 1000);
		assertEquals(lst4, arr4.getArrayList());

		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		CustomIntegerArrayList test1 = new CustomIntegerArrayList(emptyList);
		assertEquals(emptyList, test1.getArrayList());
	}

	@Test
	void testGet() {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 
		CustomIntegerArrayList arrA = new CustomIntegerArrayList();
		ArrayList<Integer> lstA = new ArrayList<Integer>();

		arrA.add(2);
		arrA.add(1, 5);
		arrA.add(2, 500);
		arrA.add(1000);

		lstA.add(2);
		lstA.add(1, 5);
		lstA.add(2, 500);
		lstA.add(1000);

		assertEquals(500, arrA.get(2));
		assertEquals(1000, arrA.get(3));
		assertEquals(-10, arrA.get(-10));
	}

	@Test
	void testAddInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		arr2.add(21);
		lst2.add(21);
		assertEquals(21, arr2.get(0));

		arr2.add(44);
		lst2.add(44);
		assertEquals(44, arr2.get(1));

		arr2.add(67);
		lst2.add(67);
		assertEquals(67, arr2.get(2));
	}

	@Test
	void testAddIntInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 	
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		arr2.add(0, 100);
		lst2.add(0, 100);
		assertEquals(100, arr2.get(0));

		arr2.add(1, 200);
		lst2.add(1, 200);
		assertEquals(200, arr2.get(1));

		arr2.add(1, 500);
		lst2.add(1, 500);
		assertEquals(500, arr2.get(1));

		assertEquals(200, arr2.get(2));
	}

	@Test
	void testRemoveInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(0);
		arr1.remove(1);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		lst1.remove(0);
		lst1.remove(1);
		
		assertEquals(lst1.get(0), arr1.get(0));

		// TODO write at least 3 additional test cases
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		arr2.add(100);
		arr2.add(500);
		arr2.add(200);

		lst2.add(100);
		lst2.add(500);
		lst2.add(200);

		arr2.remove(0);
		lst2.remove(0);
		assertEquals(500, arr2.get(0));

		arr2.remove(0);
		lst2.remove(0);
		assertEquals(200, arr2.get(0));

		assertEquals(-10, arr2.remove(-10));
	}

	@Test
	void testRemoveIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(3, 3);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(new ArrayList<Integer>(Arrays.asList(1, 2, 1, 2, 1)));
		ArrayList<Integer> lst2 = new ArrayList<Integer>(Arrays.asList( 2, 2, 1));
		arr2.remove(2, 1);
		assertEquals(lst2, arr2.getArrayList());

		CustomIntegerArrayList arr3 = new CustomIntegerArrayList(new ArrayList<Integer>(Arrays.asList(100, 100, 100)));
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		arr3.remove(3, 100);
		assertEquals(lst3, arr3.getArrayList());

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 5)));
		ArrayList<Integer> lst4 = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 5));
		arr4.remove(0, 5);
		assertEquals(lst4, arr4.getArrayList());
	}

	@Test
	void testSpliceIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 2);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
		ArrayList<Integer> lst2 = new ArrayList<Integer>(Arrays.asList(1, 4, 5));
		assertEquals(lst2, arr2.splice(1, 2));

		CustomIntegerArrayList arr3 = new CustomIntegerArrayList(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
		ArrayList<Integer> lst3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		assertEquals(lst3, arr3.splice(3, 4));

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(new ArrayList<Integer>(Arrays.asList(100, 200, 500)));
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		assertEquals(lst4, arr4.splice(1, 0));

	}

	@Test
	void testSpliceIntIntIntArray() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 1, new int[] { 4, 5 });
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
		ArrayList<Integer> lst2 = new ArrayList<Integer>(Arrays.asList(1,6,7,4,5));
		ArrayList<Integer> lst2b = new ArrayList<Integer>(Arrays.asList(2,3));
		assertEquals(lst2b, arr2.splice(1, 2, new int[] {6, 7}));
		assertEquals(lst2, arr2.getArrayList());

		CustomIntegerArrayList arr3 = new CustomIntegerArrayList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
		ArrayList<Integer> lst3 = new ArrayList<Integer>(Arrays.asList(1,2,3,1000,1001));
		ArrayList<Integer> lst3b = new ArrayList<Integer>(Arrays.asList(4,5));
		assertEquals(lst3b, arr3.splice(3, 4, new int[] {1000, 1001}));
		assertEquals(lst3, arr3.getArrayList());

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(new ArrayList<Integer>(Arrays.asList(100, 200, 500)));
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		assertEquals(lst4, arr4.splice(1, 0, new int[] {700}));

		CustomIntegerArrayList arr5 = new CustomIntegerArrayList(new ArrayList<Integer>(Arrays.asList(5,2,7,3,7,8)));
		ArrayList<Integer> lst5 = new ArrayList<Integer>();
		assertEquals(lst5, arr5.splice(6, 3, new int[] {9}));
	}

}
