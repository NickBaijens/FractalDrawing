package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tool.FractalTool;

class getSomeAngles {
	FractalTool tool = new FractalTool();
	Integer currentAngle;
	@Test
	void testAngleNotSet() {
		Integer actual = tool.getAngle();
		assertNull(actual,"angle set prematurely");
	}
	@Test
	void testAngleSet() {
		tool.setAngle();
		Integer actual = tool.getAngle();
		assertNotNull(actual,"angle not set");
		currentAngle = actual;
	}
	@Test
	void testAngleChanged() {
		for(int i=0;i<1000000;i++) {
			Integer expected = currentAngle;
			tool.setAngle();
			Integer actual = tool.getAngle();
			assertNotEquals(actual, expected, "angle has not changed in cycle: "+i);
			currentAngle = actual;
		}
		
	}

}
