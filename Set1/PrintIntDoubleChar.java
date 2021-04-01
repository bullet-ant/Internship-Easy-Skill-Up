public class PrintIntDoubleChar {
	public static void main(String[] args) {
		int intNum = 100;
		double doubleNum = 100.00;
		char character = 'a';

		PrintIntDoubleChar obj = new PrintIntDoubleChar();
		obj.display(intNum, doubleNum, character); 
	}

	public void display(int num1, double num2, char character) {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(character);
	}
}