package dataTypes;

public class Wrapper {

	public static void main(String[] args) {
		byte b = 1;
        Byte byteObj = Byte.valueOf(b);

        int i = 10;
        Integer intObj = Integer.valueOf(i);

        float f = 18.6f;
        Float floatObj = Float.valueOf(f);

        double d = 250.5;
        Double doubleObj = Double.valueOf(d);

        char c = 'a';
        Character charObj = c; // autoboxing

        System.out.println("Wrapper Objects:");
        System.out.println(byteObj);
        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(doubleObj);
        System.out.println(charObj);

        // Unboxing
        byte bv = byteObj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;

        System.out.println("\nUnwrapped values:");
        System.out.println(bv);
        System.out.println(iv);
        System.out.println(fv);
        System.out.println(dv);
        System.out.println(cv);
        
        int num1 = Integer.parseInt("100");
        System.out.println("Num one "+num1);
        
        int num2 = Integer.valueOf("200");
        System.out.println("Value of num two "+num2);
        
        int num3 = Integer.valueOf(10);
        System.out.println("Value of num three "+num3);
        
	}

}
