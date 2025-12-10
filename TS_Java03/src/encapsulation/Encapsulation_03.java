package encapsulation;

class Student {

	private String name;
	private String collegaName;
	private int rollNo;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegaName() {
		return collegaName;
	}

	public void setCollegaName(String collegaName) {
		this.collegaName = collegaName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

public class Encapsulation_03 {

	public static void main(String[] args) {
		
		 Student s = new  Student();
		 s.setName("Mallikarjun");
		 s.setRollNo(016);
		 s.setCollegaName("SCBG college");
		 s.setAddress("Kardyal, Bidar");
		 
		 System.out.println("Name : "+s.getName()+"\nRoll No.: "+s.getRollNo()+"\nCollage Name : "+s.getCollegaName()+"\nAddress : "+s.getAddress());
	} 

}
