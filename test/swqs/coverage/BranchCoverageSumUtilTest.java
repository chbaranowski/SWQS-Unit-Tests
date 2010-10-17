package swqs.coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class BranchCoverageSumUtilTest {

	@Test
	public void testSum() {
		SumUtil.sum(new int[]{2, 1}, 1);
		SumUtil.sum(new int[]{2, 1}, 0);
	}

}
