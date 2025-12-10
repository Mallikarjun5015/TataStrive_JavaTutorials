package methods;

public class Methods_Strings {
	public static void main( String[] args) {
				
		String name ="Java Full Stack";

		System.out.println("The Length of the String is: "+name.length());
		System.out.println("The char at the index 6 is: "+name.charAt(6));
		System.out.println("To Lower Case: "+name.toLowerCase());
		System.out.println("To Upper Case: "+name.toUpperCase());
		System.out.println("DO String Contains Pyhtos: "+name.contains("Python"));
		System.out.println("Do String Contains Full: "+name.contains("Full"));
		System.out.println("Dot equals false: "+name.equals("JAVA FULL STACK"));
		System.out.println("Dot Equlas same: "+name.equals("Java Full Stack"));
		System.out.println("Dot Equals ignore: "+name.equalsIgnoreCase("JAVA FULL STACK"));
		System.out.println("Trim: "+name.trim());
		System.out.println("Starts with: "+name.startsWith("Java"));
		System.out.println("Ends with: "+name.endsWith("Stack"));
		System.out.println("Get Class name: "+name.getClass());
		System.out.println("Replace: "+name.replace('c', 'k'));
		System.out.println("Substring: "+name.substring(5,9));	
	}
}
