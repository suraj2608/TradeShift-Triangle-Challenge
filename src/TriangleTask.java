import java.util.Scanner;
import java.math.BigDecimal;

public class TriangleTask {
	public static void main(String args[]) {
		BigDecimal[] sides = getAllSides();
		System.out.print("\nSides: ");
		System.out.println(sides[0].toString()+" "+sides[1].toString()+" "+sides[2].toString());

		Triangle t = new Triangle(sides[0], sides[1], sides[2]);
		TriangleType c = t.typeOfTriangle();
		System.out.println(describeTriangleType(c));
	}

	public static BigDecimal[] getAllSides() {
		BigDecimal[] sides = new BigDecimal[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter side1:");
		sides[0] = getSide(sc);

		System.out.println("Enter side2:");
		sides[1] = getSide(sc);

		System.out.println("Enter side3:");
		sides[2] = getSide(sc);

		return sides;
	}

	private static BigDecimal getSide(Scanner sc) {
		while (!sc.hasNextBigDecimal()) {
			System.out.println("Please enter a number");
			sc.nextLine();
		}
		BigDecimal side = sc.nextBigDecimal();
		sc.nextLine();
		return side;
	}

	public static String describeTriangleType(TriangleType c) {
		switch (c) {
			case EQUILATERAL:
				return "These sides form an Equilateral triangle.";
			case ISOSCELES:
				return "These sides form an Isosceles triangle.";
			case SCALENE:
				return "These sides form a Scalene triangle.";
			case NO_TRIANGLE:
				return "These sides do not form a triangle.";
		}
		return null;
	}
}