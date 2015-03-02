package org.testing.com;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.test.com.Calcu;

public class sim {

	@Test
	public void test() {
		Calcu test = new Calcu();
		final int expectedSum = 7;
		final int resultSum = test.add(3, 4);
		Assert.assertEquals(expectedSum, resultSum);
		
		
	}

}
