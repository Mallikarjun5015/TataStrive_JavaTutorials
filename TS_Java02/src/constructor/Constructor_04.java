package constructor;

class TataStrive{
	String course_name;
	String batch_name;
	int duration;
	int count;
	
	public TataStrive(String course_name, String batch_name, int duration, int count) {
		this.course_name = course_name;
		this.batch_name = batch_name;
		this.duration = duration;
		this.count = count;
	}
	
	public void tataStrive_details(String address) {
		System.out.println("The TataStrive details...!!");
		System.out.println("--------------------------");
		System.out.println("The Course name  : " + course_name);
		System.out.println("The Batch Name   : " + batch_name);
		System.out.println("The Duration     : " + duration);
		System.out.println("The Batch count  : " + count);
		System.out.println("Center Address   : " + address);
	}
}
public class Constructor_04 {

	public static void main(String[] args) {
		
		new TataStrive("Java Full Stack","JFSJD00001",4,30)
		.tataStrive_details("Veerannapalya, Bengaluru");
	}

}
