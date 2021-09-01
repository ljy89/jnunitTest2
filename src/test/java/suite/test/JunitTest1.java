package suite.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest1 {

	@Test
	public void test() {
		String str = "JUnit is working fine.";
		String temp = null;
		
		
		assertEquals("JUnit is working fine.", str);
		assertNull(temp);
	}

}
