public class EquivalentASCII {
	public static void main(String[] args) {
		char ch = 'd';

		int newASCII = (int) ch + 3;
		char equivalentChar = (char) newASCII;

		System.out.println(equivalentChar);
	}
}