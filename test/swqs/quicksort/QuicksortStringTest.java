package swqs.quicksort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuicksortStringTest {

	Quicksort<String> quicksortSUT;

	@Before
	public void setUp() {
		quicksortSUT = new Quicksort<String>(new StringComperator());
	}

	@Test
	public void testQuickSort() throws Exception {
		String[] values = new String[] { "C", "D", "X", "A" };
		quicksortSUT.sort(values);
		
		String[] expectedOrder = new String[] { "A", "C", "D", "X" };
		assertArrayEquals(expectedOrder, values);
	}
	
	@After
	public void tearDown(){
		quicksortSUT = null;
	}
	

}
