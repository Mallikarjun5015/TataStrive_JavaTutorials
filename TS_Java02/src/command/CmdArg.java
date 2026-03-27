package command;

public class CmdArg {

	public static void main(String[] mallu) {
		
		/*
		 * System.out.println(args[0]); System.out.println(args[1]);
		 * System.out.println(args[2]); System.out.println(args[3]);
		 * 
		 * System.out.println(args.length);
		 */

		if(mallu.length>0) {
			for(String s : mallu) {
				System.out.println(s);
			}
		}else {
			System.out.println("No args..");
		}
	}

}
