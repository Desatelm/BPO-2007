package mathArthemeticTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import mathArthemetic.ArthematicOpration;

class ArthematicOprationTest {
	
	static private ArthematicOpration  classUndertest;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	classUndertest = new ArthematicOpration();
	}

	@Test
	void testSubtract() {
		long result = 18 + 23 + (-1) + 16;
		assertEquals(result, classUndertest.adder(18,23,-1,16));
		
		result = 180 + 182; 
		assertEquals(result, classUndertest.adder(180, 182));
		
		result = 0;
		assertEquals(result,classUndertest.adder(0) );
		
	}

	@Test
	void testAdder() {
		fail("Not yet implemented");
	}

}
