package Basic;

class VTU {
	String name;
	int empNo;
	double sal;
	public VTU(String name, int empNo, double sal) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.sal = sal;
	}
	
	VTU(VTU v){
		this.name = v.name;
		this.empNo = v.empNo;
		this.sal = v.sal;
	}
	
	void display()
	{
		System.out.println(this.name+" "+this.empNo+" "+this.sal);
	}
}

public class DemoApp {

	public static void main(String[] args) {
		VTU h1 = new VTU("mallu",10,120000.00);
		h1.display();
		VTU h2 = new VTU(h1);
		System.out.println(h2.name);
	}
}
