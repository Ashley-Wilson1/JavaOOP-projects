
public class Circle extends Shape{
	private int radius;
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public int getArea() {
		return(int)( Math.PI * radius *radius);
	}
	
	public Circle() {
		super(1);
	}
	//test
	public Circle(int radius) {
		super(1);
		this.radius = radius;
	}
}
