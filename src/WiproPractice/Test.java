package WiproPractice;
public class Test {
	public static void main(String[] args) {
		Test obj = new Test();
		obj.start();
	}
	void start() {
		long[] array1 = { 3, 4, 5 };
		System.out.print(array1[0] + array1[1] + array1[2] + " ");
		long[] array2 = method(array1);
		System.out.print(array1[0] + array1[1] + array1[2] + " ");
		System.out.println(array2[0] + array2[1] + array2[2]);
	}
	long[] method(long[] a3) {
		a3[1] = 7;
		return a3;
	}
}	
