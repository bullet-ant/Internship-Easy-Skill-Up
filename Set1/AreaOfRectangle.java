public class AreaOfRectangle {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;

		AreaOfRectangle obj = new AreaOfRectangle();
		obj.findArea(a, b);
	}

	public void findArea(int a, int b) {
		int area = a * b;
		System.out.println(area);
	}
}