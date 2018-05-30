package tool;

import java.util.Scanner;

public class ToolMain {
	
	static Scanner myInput = new Scanner(System.in);
	static FractalTool tool = new FractalTool();
	private static Integer angle;
	
	public static void main(String[] args) {
		System.out.println("draw a line");
		System.out.println("For each new angle shown, draw a new line from your previous line at the angle shown");
		System.out.println("If you hit the edge of the paper or another line, draw branches with the same rules.");
		
		tool.setAngle();
		angle = tool.getAngle();
		System.out.println(angle);
		
		while(true) {
			System.out.println("press enter for new angle");
			String antwoord = myInput.nextLine();
			if(antwoord.equals("")) {
				tool.setAngle();
				angle = tool.getAngle();
				System.out.println(angle);
			}
			else {
				System.out.println("unknown command");
			}
		}
	}
}
