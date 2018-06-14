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
	
	//subLine constructor
	public Line(Line parent, int branch) {
		myParent = parent;
		angle = ThreadLocalRandom.current().nextInt(-60, 60);
		name = myParent.name+"."+branch;
	}
	
	//new subLine
	public Line newSubLine(Line parent, int branch) {
		a = branch==1? new Line(parent,branch) : a;
		b = branch==2? new Line(parent,branch) : b;
		if(branch == 1) {
			return a;
		}
		if(branch == 2) {
			return b;
		}
		else throw new IllegalArgumentException("branch number must be 1 or 2");
		
	}
	
	public String toString() {
		String data = "ID: "+name+" Angle: "+angle;
		data += "\n";
		if(a!=null) {
			data += a;
		}
		if(b!=null) {
			data += b;
		}
			
		return data;
	}
}
