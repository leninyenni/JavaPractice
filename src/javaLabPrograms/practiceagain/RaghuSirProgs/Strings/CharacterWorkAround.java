package javaLabPrograms.practiceagain.RaghuSirProgs.Strings;
public class CharacterWorkAround {
	public static void main(String args[]) {
		char ch1 = 'A';
		char ch2 = 'a';
		char ch3 = Character.toLowerCase(ch1);
		char ch4 = Character.toLowerCase(ch2);
		System.out.println(ch1 + " is converted to " + ch3);
		System.out.println(ch2 + " is converted to " + ch4);
		System.out.println("\nch3 is lowercase letter: "
				+ Character.isLowerCase(ch3));
		System.out.println("ch4 is lowercase letter: "
				+ Character.isLowerCase(ch4));
		
		
		char ch5='L';
		char ch6= (char) (ch5+32);
		System.out.println(ch6);
		
		char ch7= 98;
		System.out.println(ch7);
		String s="asHoK Leni Yne";
		System.out.println(s.toUpperCase());
		
		String name="My Nme is lenin kumar yenni";
		System.out.println(name.replaceAll(" ",""));
		//System.out.println(name.replaceAll("\\s",""));
		
	}
}

