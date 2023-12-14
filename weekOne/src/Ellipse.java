
public class Ellipse extends Rectangle{

	

	public Ellipse(int width,int height) {
		
		super(width,height);
		super.setSides(1);
	}
	public Ellipse() {
		super.setSides(1);

	}
	
	public String toString() {
		return "the height is "+super.getHeight()+" the width is " +super.getWidth()+" with "+super.getSides()+" sides and an area of "+ getArea();
	}
	
	public int getArea() {
		return (int)(Math.PI*super.getWidth()*super.getHeight());
	}
}
