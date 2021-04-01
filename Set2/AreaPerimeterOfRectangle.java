public class AreaPerimeterOfRectangle {
	public static void main(String[] args) {
		int length = 5;
		int breadth = 7;

		AreaPerimeterOfRectangle obj = new AreaPerimeterOfRectangle();
		int area = obj.getArea(length, breadth);
		int perimeter = obj.getParameter(length, breadth);

		System.out.println("Perimeter: " + perimeter +" Area: " + area);
	}

	public int getParameter(int l, int b) {
		return 2 * (l + b);
	}

	public int getArea(int l, int b) {
		return l * b;
	}
}