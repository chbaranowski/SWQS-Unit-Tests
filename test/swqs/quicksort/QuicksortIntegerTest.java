package swqs.quicksort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuicksortIntegerTest {

	Quicksort<Integer> quicksortSUT;

	@Before
	public void setUp() {
		quicksortSUT = new Quicksort<Integer>(new IntComperator());
	}

	@Test
	public void testSlowSort() throws Exception {
		Integer[] values = new Integer[] { 5, 8, 2, 4, 7 };
		quicksortSUT.sort(values);
		
		Integer[] expectedOrder = new Integer[] { 2, 4, 5, 7, 8 };
		assertArrayEquals(expectedOrder, values);
	}
	
	@Test
	public void testQuickSort() throws Exception {
		Integer[] values = new Integer[] { 5, 8, 2, 4, 7 };
		quicksortSUT.slowIntegerSort = false;
		quicksortSUT.sort(values);
		
		Integer[] expectedOrder = new Integer[] { 2, 4, 5, 7, 8 };
		assertArrayEquals(expectedOrder, values);
	}
	
	@After
	public void tearDown(){
		quicksortSUT = null;
	}
	

}
