package labIX;

public class Test {

	public static void main(String[] args) {
		GeometricObject circle1 = new Circle(5);
		GeometricObject circle2 = new Circle(4);
		
		GeometricObject rectangle1 = new Rectangle(1,8);
		GeometricObject rectangle2 = new Rectangle(4,9);
		
		GeometricObject maxCircle = (GeometricObject) GeometricObject.max(circle1, circle2);
		GeometricObject maxRectangle = (GeometricObject) GeometricObject.max(rectangle1, rectangle2);
		
		System.out.println("The larger circle's radius is "+ maxCircle.getRadius());
		System.out.println(maxCircle);
		
		System.out.println("The larger rectangle's perimeter is "+ maxRectangle.getPerimeter());
		System.out.println(maxRectangle);
		
		
	}

}
