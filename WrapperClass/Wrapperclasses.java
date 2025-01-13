package WrapperClass;

public class Wrapperclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxing or Wrapping
		int obj=10;
		Integer a=Integer.valueOf(obj);
		int j=a.intValue();//UnBoxing
		
		
		byte b=10;
		long l=123456;
		short s=4;
		double d=55.98D;
		boolean b2=true;
		float f=67.987F;
		int i=76;
		char c='a';
		
		//autoboxing: Converting primitive to objects
		Byte byteobj=b;
		Long longobj=l;
		Short shortobj=s;
		Double doubleobj=d;
		Boolean booleanobj=b2;
		Float floatobj=f;
		Integer intobj=i;
		Character charobj=c;
		System.out.println("Primitive type to Object:");
		System.out.println("Byte Object: "+byteobj);
		System.out.println("Long Object: "+longobj);
		System.out.println("Short Object: "+shortobj);
		System.out.println("double Object: "+doubleobj);
		System.out.println("Boolean Object: "+booleanobj);
		System.out.println("Float Object: "+floatobj);
		System.out.println("Integer Object: "+intobj);
		System.out.println("Character Object: "+charobj);
		System.out.println("--------------------------------");
		
		
		
		//Autounboxing: convert objects to primitive
		
		byte bytevalue=byteobj;
		long longvalue=longobj;
		short shortvalue= shortobj;
		double doublevalue=doubleobj;
		boolean booleanvalue=booleanobj;
		float floatvalue=floatobj;
		int intvalue= intobj;
		char charvalue= charobj;
		
		System.out.println("Objects to primitives:");
		System.out.println("byte value: "+bytevalue);
		System.out.println("long value: "+longvalue);
		System.out.println("short value: "+shortvalue);
		System.out.println("double value: "+doublevalue);
		System.out.println("boolean value: "+booleanvalue);
		System.out.println("float value: "+floatvalue);
		System.out.println("int value: "+intvalue);
		System.out.println("char value: "+charvalue);
		System.out.println("--------------------------------");
		
		//Converting String into datatype [String itself comes under Object an instance of the String class.]
		System.out.println("String to primitives");
		String s1="123";
		int val=Integer.parseInt(s1);
		System.out.println(val);
		String s2="10";
		double val2=Double.parseDouble(s2);
		System.out.println(val2);

	}

}

