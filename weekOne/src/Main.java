import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Rectangle r1 = new Rectangle(10,20);
			System.out.println(r1.getArea());
			
			Rectangle r2 = new Rectangle();
			r2.setHeight(25);
			r2.setWidth(17);
			System.out.println(r2.getArea());
			
			Circle c1 = new Circle(10);
			Circle c2 = new Circle();
			c2.setRadius(3);
			System.out.println(c1.getArea());
			System.out.println(c2.getArea());
			
			Ellipse e1 = new Ellipse(20,10);
			
			System.out.println(e1);
	}

}
