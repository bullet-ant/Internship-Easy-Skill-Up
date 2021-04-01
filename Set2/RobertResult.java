public class RobertResult {
	public static void main(String[] args) {
		int marks1 = 78;
		int marks2 = 45;
		int marks3 = 62;

		RobertResult obj = new RobertResult();

		int total = obj.getTotal(marks1, marks2, marks3);

		System.out.println("Total scored: " + total + ", Percentage: " + obj.getPercentage(300, total));

	}

	public int getTotal(int a, int b, int c) {
		return a + b + c;
	}

	public float getPercentage(int total, int scored) {
		return (scored  * 100 / total);
	}
}