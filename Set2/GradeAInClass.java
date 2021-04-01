public class GradeAInClass {
	public static void main(String[] args) {
		int total = 90;
		int boys = 45;

		int boysWithGradeA = 20;
		int studentsWithGradeA = (int) (0.5 * 90);

		int girlsWithGradeA = studentsWithGradeA - boysWithGradeA;

		System.out.println(girlsWithGradeA);
	}
}