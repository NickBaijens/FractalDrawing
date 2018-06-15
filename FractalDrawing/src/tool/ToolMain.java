package tool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToolMain {
		
	//static FractalTool tool = new FractalTool();
	private static List<Line> lines = new ArrayList<Line>();
	private static List<Line> newLines = new ArrayList<Line>();
	static Scanner myInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		//tool.handleInput();
		Line startLine = new Line();//line 1
		lines.add(startLine);
		System.out.println(lines);
		while(true) {
			
			String antwoord = myInput.nextLine();
			if(antwoord.equals("")) {
				drawLines();
				System.out.println(lines);
				System.out.println(lines.size());
			}
			if(lines.size()>1000000) {
				break;
			}
		}		
	}
	
	public static void drawLines() {				
		
		Line a;
		Line b;		
		
		for(Line line : lines) {
			
			a = line.newSubLine(line,1);//line x.1
			newLines.add(a);
			
			b = line.newSubLine(line,2);//line x.2			
			newLines.add(b);
		}
		lines = newLines;
		newLines = new ArrayList<Line>();
	}
}
