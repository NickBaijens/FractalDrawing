package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tool.FractalTool;

class FractalToolTest {
	FractalTool tool = new FractalTool();
	Integer currentAngle;

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
			tool.setAngle();
			Integer actual = tool.getAngle();
			assertNotEquals(actual, 0, "angle has not changed in cycle: "+i);
			currentAngle = actual;
		}		
	}
}
