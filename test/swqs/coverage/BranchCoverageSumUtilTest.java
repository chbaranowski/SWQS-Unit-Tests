package swqs.coverage;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class BranchCoverageSumUtilTest {

	@Test
	public void testSum_21() {
		assertThat(SumUtil.sum(new int[]{2}, 1), is(3));
	}
	
	@Test
	public void testSum_20() throws Exception {
		assertThat(SumUtil.sum(new int[]{2}, 0), is(2));
	}
	
	@Test
	public void testSum_22() throws Exception {
		assertThat(SumUtil.sum(new int[]{2}, 2), is(2));
	}

}
