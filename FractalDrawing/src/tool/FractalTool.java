package tool;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class FractalTool {
	
	static Scanner myInput = new Scanner(System.in);
	private Integer angle;
	private Integer newAngle;
	
	public FractalTool() {
		System.out.println("Draw a line");
		System.out.println("For each new angle shown, draw a new line from your previous line at the angle shown");
		System.out.println("If you hit the edge of the paper or another line, draw branches with the same rules.");
		System.out.println("Repeat till your page is filled");
		inputHandler();
	}
	
	public Integer getAngle() {
		
		return angle;
	}
	
	public void setAngle() {
		
		while (newAngle==angle) {
			newAngle = ThreadLocalRandom.current().nextInt(-25, 25);
		}
		angle = newAngle;
	}
	
	public void inputHandler() {
		while(true) {
			System.out.println("press enter for new angle or q to quit");
			String antwoord = myInput.nextLine();
			if(antwoord.equals("")) {
				setAngle();
				angle = getAngle();
				System.out.println(angle);
			}
			else if(antwoord.equals("q")) {
				System.exit(0);
			}
			else {
				System.out.println("unknown command");
			}
		}
	}
}
