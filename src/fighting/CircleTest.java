package fighting;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.radius=2.1;
		double area =c.findArea();
		System.out.println(area);
	}
}
	class Circle{
	   double radius;
		public double findArea() {
			double area =Math.PI*radius*radius;
			return area;
		}
		
	}	
