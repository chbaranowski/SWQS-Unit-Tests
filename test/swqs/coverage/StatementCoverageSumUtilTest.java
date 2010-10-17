package swqs.coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatementCoverageSumUtilTest {

	@Test
	public void testSum() {
		assertEquals(3 , SumUtil.sum(new int[]{2}, 1));
	}

}
