package tool;

import java.util.concurrent.ThreadLocalRandom;

public class FractalTool {
	private Integer angle;
	private Integer newAngle;
	
	public Integer getAngle() {
		
		return angle;
	}
	
	public void setAngle() {
		
		while (newAngle==angle) {
			newAngle = ThreadLocalRandom.current().nextInt(-25, 25);
		}
		angle = newAngle;
	}
}
