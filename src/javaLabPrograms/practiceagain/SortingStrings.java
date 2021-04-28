package javaLabPrograms.practiceagain;
import java.util.Scanner;
public class SortingStrings {
	public static void main(String[] args) throws Exception {
		int n, i, j;
		Scanner dis = new Scanner(System.in);
		System.out.println("Ente the number of Strings :");
		n = dis.nextInt();
		
		Scanner enter= new Scanner(System.in);
		String str[] = new String[n];
		for (i = 0; i < n; i++) {
			System.out.println("Enter string " + (i + 1) + " :");
			str[i] = enter.nextLine();
		}
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if ((str[i].compareTo(str[j])) > 0) {
					String tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
			}
		}
		System.out.println("The String after Sorting : ");
		for (i = 0; i < n; i++)
			System.out.println(str[i]);
	}
}
