package polymorphism;

class Area {

	public int area(int a) {
		int result=a*a;
		System.out.println("Area of the Square is: "+result);

		return result;
	}

	public int area(int l,int b) {

		int result=l*b;
		System.out.println("Area of the Reactangle is: "+result);

		return result;
	}

	public double area(double r) {

		final double PI = 3.142f;
		
		double result = PI*r*r;
		
		System.out.println("The area of the Circle is "+result);
		return result;
	}
}

public class Polymorphism_02_Area {

	public static void main(String[] args) {

		Area a = new Area();
		a.area(5);
		a.area(5, 10);
		a.area(5.0);
	}

}
