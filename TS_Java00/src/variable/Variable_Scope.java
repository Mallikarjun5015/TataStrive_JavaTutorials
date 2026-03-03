package variable;

class Variable{
	
	static int num1 = 100;
	
	private int num2 =200;
	
	int sum=0;
	
	int sum (int num1, int num2) {
		
		Variable v = new Variable();
		v.num2=340;
		
		sum=100;
		
		System.out.println("sum is "+sum);
		sum = num1+num2;
		
		System.out.println("Current this num 2 "+this.num2);
		System.out.println("Current obj num 2 "+v.num2);
		System.out.println("Normal Num2 "+num2);
		System.out.println("Class num1 "+Variable.num1);
	
		return sum;
	}
	
}

public class Variable_Scope {

	public static void main(String[] args) {
		
		Variable v = new Variable();
		
		System.out.println("Hello Java Developers..sum "+v.sum(13,7));
		
		{
			int num4 = 300;
			System.out.println("Inside the block.. num is "+num4);
		}
		//System.out.println("Inside the block.. num is "+num4);
	}

}
