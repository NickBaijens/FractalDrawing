package tool;


public class ToolMain {
		
	//static FractalTool tool = new FractalTool();
	static Line startLine = new Line();
	
	public static void main(String[] args) {
		//tool.handleInput();
		Line a = startLine.newSubLine(startLine,1);
		Line c = a.newSubLine(a, 1);
		Line b = startLine.newSubLine(startLine,2);
		Line d = b.newSubLine(b, 2);
		System.out.println(startLine);
	}	
}
