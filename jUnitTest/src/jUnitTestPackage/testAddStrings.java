package jUnitTestPackage;



import static org.junit.Assert.*;

import org.junit.Test;



public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.addStrings("Hello ","World");
		assertEquals ("Hello World",result);
	}

}
