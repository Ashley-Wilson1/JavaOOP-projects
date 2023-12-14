
public class Rectangle extends Shape
{
	private static  int sides = 4;
	private int width;
	private int height;
	
	
	public int getArea() {
		return width*height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public Rectangle(int width, int height) {
		
		super(4);
		
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		super(4);
	}
}
