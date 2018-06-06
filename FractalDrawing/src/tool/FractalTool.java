package tool;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class FractalTool {
	
	static Scanner myInput = new Scanner(System.in);
	private Integer angle;
	private Integer newAngle;
	private Integer subBranch;
	private String branch;
	
	public FractalTool() {
		angle = 0;
		newAngle = 0;
		subBranch = 0;
		branch = "";
		
		System.out.println("Draw a line");
		System.out.println("For each new angle shown, draw a new line from your previous line at the angle shown");
		System.out.println("If you hit the edge of the paper or another line, draw branches with the same rules.");
		System.out.println("Repeat till your page is filled");
	}
	
	public Integer getAngle() {
		
		return angle;
	}
	
	public void setAngle() {
		
		newAngle = ThreadLocalRandom.current().nextInt(-2, 2);
		while (newAngle==0) {
			newAngle = ThreadLocalRandom.current().nextInt(-2, 2);
		}
		subBranch = subBranch+1;
		angle = newAngle;
	}
	
	public void subdivBranch() {
		branch = branch+subBranch+".";
		subBranch = 0;
	}
	
	public Integer getSubBranch() {
		return subBranch;
	}
	
	public void handleInput() {
		while(true) {
			
			System.out.println("press enter for new angle, b to start a new branch or q to quit");
			String antwoord = myInput.nextLine();
			
			if(antwoord.equals("")) {
				setAngle();
				System.out.println("branch: "+branch+subBranch);
				System.out.println("angle: "+angle);
			}
			
			else if(antwoord.equals("b")) {
				subdivBranch();
				setAngle();
				System.out.println("branch: "+branch+subBranch);
				System.out.println("angle: "+angle);
			}
			
			else if(antwoord.equals("q")) {
				System.out.println("quit program");
				break;
			}
			
			else {
				System.out.println("unknown command");
			}
		}
	}
}
