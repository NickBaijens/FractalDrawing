package tool;

import java.util.concurrent.ThreadLocalRandom;

public class Line {
	private Line myParent;
	private Line a;
	private Line b;
	private Integer angle;
	private String name;
	//initial constructor
	public Line() {
		myParent = null;
		angle = ThreadLocalRandom.current().nextInt(-15, 15);
		name = "1";
	}
	public Line(Line parent, int branch) {
		myParent = parent;
		angle = ThreadLocalRandom.current().nextInt(-15, 15);
		name = myParent.name+"."+branch;
	}
	//new sub Line
	public Line newSubLine(Line parent, int branch) {
		a = branch==1? new Line(parent,branch) : a;
		b = branch==2? new Line(parent,branch) : b;
		if(branch == 1) {
			return a;
		}else return b;
		
	}
	public String toString() {
		return "name: "+name+", subLine a: "+a+", subLine b: "+b;
	}
}
