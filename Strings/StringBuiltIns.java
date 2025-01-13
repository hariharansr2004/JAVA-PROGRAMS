package Strings;
/*
 * String is a class in which sequence od characters that represents text.
 * String can be a letter,number,symbol,spaces.
 */
public class StringBuiltIns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" Hariharan S ";
		//replace()-> Replace all occurrences of a specified character or substring with a new character or substring in a given string. 
		System.out.println("String after removing all the 'a': "+str.replace("a", "b"));
		//replace()-> Replace all occurrences of spaces or text we specify.
		System.out.println("String after removing all the spaces: "+str.replace(" ",""));
		System.out.println("String after removing all the spaces: "+str.replace(" ","_"));
		//trim()-> Removes white spaces before and after the string
		System.out.println("Trim"+str.trim());
		//toUpperCase()->Change all characters to upper case
		System.out.println(str.toUpperCase());
		//toLowerCase()->Change all characters to lower case
		System.out.println(str.toLowerCase());
		//startsWith()->Check if the string start with specified value and return True
		System.out.println(str.startsWith("Di"));//true
		//endsWith()->Check if the string start with specified value and return True
		System.out.println(str.endsWith("mar"));//true
		System.out.println("-----------------------------------------------------------------------");
		//charAt()->returns the character of index position (including whitespaces)
		System.out.println(str.charAt(0));//including whitespaces
		System.out.println(str.charAt(1));
		//intern()->Converting the String Object s1 into s3 using intern()
		//Eg:Copying str object to another (object cloning)
		String a =new String("Hari");
		String b= a.intern();
		System.out.println(b);
		//concat->Joining two strings together
		String x="Java";
		String y="is";
		String z="Great";
		String a1=z.concat(x);
		String b1=x.concat(y).concat(z);
		System.out.println(a1);
		System.out.println(b1);
		//valueOf->Converting a datatype into String
		int c=10;
		String val=String.valueOf(c); //10->"10";
		System.out.println(val+10);
		//equals->compares two strings, and returns true if the strings are equal else false.
		System.out.println(x.equals(y));
		
	}

}
