package dataTypes;

public class TypeCaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. implicit
        // byte b= 12; // 1 byte
        // int i = (byte)b; // 4 bytes
         // System.out.println("",+i);

         // 2. explicit
         int b= 12;
         byte i = (byte) b;
         System.out.println(i);

         short s = 12345;
         long l = s;
         System.out.println(l);

         long l1 = 12345345;
         short s1= (short)l1;
         System.out.println(s1);

         int i1 = 1;
         char c = (char)i1;
         System.out.println(c);

         int x = 5;
         double y =2.5;
         double z = x+y;
         System.out.println(z);

	}

}
