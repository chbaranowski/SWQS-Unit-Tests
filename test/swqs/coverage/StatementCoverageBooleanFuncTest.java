package swqs.coverage;

import static swqs.coverage.BooleanFunc.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class StatementCoverageBooleanFuncTest {
	
	@Test
	public void testAAndbOrC_falsefalseflase() throws Exception {
		assertThat(aAndbOrC(false, false, false), is(false));
	}
	
	@Test
	public void testAAndbOrC_falsefalsetrue() throws Exception {
		assertThat(aAndbOrC(false, true, true), is(true));
	}
	
	@Test
	public void testAAndbOrC_truetruefalse() throws Exception {
		assertThat(aAndbOrC(true, true, false), is(true));
	}
	
}
