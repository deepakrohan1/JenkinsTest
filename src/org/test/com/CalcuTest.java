package org.test.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcuTest {

	@Test
	public void test() {
		Calcu test = new Calcu();
		test.add(1,3);
		assertEquals(4, 4);
	}

}
