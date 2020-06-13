package wrapperClasses;
/*The valueOf() method converts data from its internal form into human-readable form.It is static method that is overloaded within string for all of Java’s build-in types, so that each type can be converted properly into a string.
 It is called when a string representation of some other type data is needed-for example during concatenation operation.you can call this method with any data type and get a reasonable String representation

 valueOf() returns java.lang.Integer, which is the object representative of the integer

 static String valueOf(int num)
 static String valueOf(float num)
 static String valueOf(boolean sta)
 static String valueOf(double num)
 static String valueOf(char[] data, int offset, int count)
 static String valueOf(long num)
 static String valueOf(Object ob)
 static String valueOf(char chars[])
 */
public class ValueOfMethodApps {
	public static void main(String arg[]) {
		int iNum = 30;
		double fNum = 4.56789;
		String s = "91";
		// Returns the string representation of int iNum.
		String sample = String.valueOf(iNum);
		System.out.println(sample);
		// concatenating string with iNum
		System.out.println(sample + s);
		// Returns the string representation of the float fnum.
		sample = String.valueOf(fNum);
		System.out.println(sample);
		// concatenating string with fNum
		System.out.println(s + sample);
	}
}
