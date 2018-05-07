
public class Edge {
	private Point p1;
	private Point p2;
	private boolean isColored;
	
	public Edge() { super(); }
	
	public Edge(Point p1, Point p2,boolean isColored) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.isColored = isColored;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public boolean isColored() {
		return isColored;
	}

	public void setColored(boolean isColored) {
		this.isColored = isColored;
	}
	
	
	
	
}
