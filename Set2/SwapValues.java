import java.util.*;

public class SwapValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + " " + b);

		int c = a;
		a = b;
		b = c;

		System.out.println(a + " " + b);
		System.out.println("Is that reversed?");
	}
}