package swqs.coverage;

import static swqs.coverage.BooleanFunc.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class BooleanFuncTest {
	
	@Test
	public void testAAndbOrC_falsefalseflase() throws Exception {
		assertThat(aAndbOrC(false, false, false), is(false));
	}
	
	@Test
	public void testAAndbOrC_falsefalsetrue() throws Exception {
		assertThat(aAndbOrC(false, false, true), is(true));
	}
	
	@Test
	public void testAAndbOrC_falsetrueflase() throws Exception {
		assertThat(aAndbOrC(false, true, false), is(false));
	}
	
	@Test
	public void testAAndbOrC_falsetruetrue() throws Exception {
		assertThat(aAndbOrC(false, true, true), is(true));
	}
	
	@Test
	public void testAAndbOrC_truefalseflase() throws Exception {
		assertThat(aAndbOrC(true, false, false), is(false));
	}
	
	@Test
	public void testAAndbOrC_truefalsetrue() throws Exception {
		assertThat(aAndbOrC(true, false, true), is(true));
	}
	
	@Test
	public void testAAndbOrC_truetruefalse() throws Exception {
		assertThat(aAndbOrC(true, true, false), is(true));
	}
	
	@Test
	public void testAAndbOrC_truetruetrue() throws Exception {
		assertThat(aAndbOrC(true, true, true), is(true));
	}
	
}
