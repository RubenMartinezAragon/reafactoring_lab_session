package lanSimulation.internals;

public class Printer extends Node {

	public Printer(byte type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}
	
	public Printer(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
		// TODO Auto-generated constructor stub
	}
	
	protected void printNameXML(StringBuffer buf) {
		buf.append("<printer>");
		buf.append(this.name_);
		buf.append("</printer>");
	}

	protected void printName(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(this.name_);
		buf.append(" [Printer]");
	}
}
