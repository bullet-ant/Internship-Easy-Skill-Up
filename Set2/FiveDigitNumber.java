import java.util.*;

public class FiveDigitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sum = ((num % 100) / 10) + (num / 10000);

		System.out.println(sum);
	}
}