package tool;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class FractalTool {
	
	static Scanner myInput = new Scanner(System.in);
	private Integer angle;
	private Integer newAngle;
	private Integer branch;
	
	public FractalTool() {
		angle = 0;
		newAngle = 0;
		branch = 1;
		System.out.println("Draw a line");
		System.out.println("For each new angle shown, draw a new line from your previous line at the angle shown");
		System.out.println("If you hit the edge of the paper or another line, draw branches with the same rules.");
		System.out.println("Repeat till your page is filled");
	}
	
	public Integer getAngle() {
		
		return angle;
	}
	
	public void setAngle() {
		
		newAngle = ThreadLocalRandom.current().nextInt(-25, 25);
		while (newAngle==0) {
			newAngle = ThreadLocalRandom.current().nextInt(-25, 25);
		}
		angle = newAngle;
	}
	
	public void upBranch() {
		branch = branch+1;
	}
	
	public Integer getBranch() {
		return branch;
	}
	public void handleInput() {
		while(true) {
			System.out.println("press enter for new angle, b to start a new branch or q to quit");
			String antwoord = myInput.nextLine();
			if(antwoord.equals("")) {
				setAngle();
				angle = getAngle();
				System.out.println("branch: "+branch);
				System.out.println("angle: "+angle);
			}
			else if(antwoord.equals("b")) {
				upBranch();
				setAngle();
				System.out.println("branch: "+branch);
				System.out.println("angle: "+angle);
			}
			else if(antwoord.equals("q")) {
				break;
			}
			else {
				System.out.println("unknown command");
			}
		}
	}
}
