public class ArithmeticOperations {
	public static void main(String[] args) {
		int a = 8;
		int b = 2345;

		int c = a + b;
		int d = c / 3;
		int e = d % 5;
		int f = e * 5;

		System.out.println("(((" + a + " + " + b + ") / 3) % 5) * 5 = " + f);
	}
}