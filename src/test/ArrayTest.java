package test;

public class ArrayTest {

	public static void main(String[] args) {
		int[] array = { 6, 7, 3 };
		System.out.println(array[1] + "單一取出");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("強化for");
		for (int ints : array) {
			System.out.println(ints);
		}
		java.util.Date date = new java.util.Date();
		System.out.println(date);
		System.out.println(String.format("%tj", date));
		System.out.println(String.format("%ta", date));
		System.out.println(String.format("%tA", date));
		System.out.println(String.format("%tb", date));
		System.out.println(String.format("%tB", date));
		System.out.println(String.format("%tY", date));
	}
}
