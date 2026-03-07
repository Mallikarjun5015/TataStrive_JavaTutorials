package command;

public class VarArg {
	
	public static void show(int n,String...Mallu) {
		
		for (String names : Mallu) {
			System.out.println(names);
		}
		System.out.println("Number: "+n);
		System.out.println(Mallu.length);
	}

	public static void main(String[] args) {
		
		show(1,"Dinga","Dingi","Java");
		show(2,"Gunda", "Gundi");
		show(3);

	}

}
