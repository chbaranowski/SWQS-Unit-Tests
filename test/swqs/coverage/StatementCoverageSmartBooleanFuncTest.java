package swqs.coverage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static swqs.coverage.SmartBooleanFunc.aAndbOrC;

import org.junit.Test;

public class StatementCoverageSmartBooleanFuncTest {

	@Test
	public void testAAndbOrC_falsefalseflase() throws Exception {
		assertThat(aAndbOrC(false, false, false), is(false));
	}
	
	@Test
	public void testAAndbOrC_falsefalsetrue() throws Exception {
		assertThat(aAndbOrC(false, false, true), is(true));
	}

}
