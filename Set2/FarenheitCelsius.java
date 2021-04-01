import java.util.*;

public class FarenheitCelsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double farenheit = sc.nextDouble();

		double celsius = ((farenheit - 32) * 5) / 9;

		System.out.println("Farenheit: " + farenheit + ", Celsius: " + celsius);		
	}
}