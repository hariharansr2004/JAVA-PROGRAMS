package Methods;
/*Varargs->Variable arguments allows a method to accept multiple arguments of a specified type
 * Make methods more flexible and no need of overloaded methods
 * Java will pack args into array format
 * To use varagrs datatype...
 * A method cannot have more than one varargs parameter.
*/
public class VarArgs {
	public static void varargs(String... strval) {
		for (String a : strval) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		VarArgs.varargs("Hari", "Dinesh", "Kumar", "Saran");
	}

}
