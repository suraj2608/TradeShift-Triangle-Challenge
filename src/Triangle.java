import java.math.BigDecimal;

public class Triangle {
	private BigDecimal side1, side2, side3;

	//Initializing the three sides of the triangle
	public Triangle(BigDecimal side1, BigDecimal side2, BigDecimal side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	private boolean greaterThanZero(BigDecimal bd) {
		return bd.compareTo(BigDecimal.ZERO) == 1;
	}

	//The following function checks if each side is greater than 0 
	// and no side is greater than the sum of the other two sides.
	//Returns true if the above two conditions are both true.
	public boolean conditionChecks() {
		if(greaterThanZero(side1) && greaterThanZero(side2) && greaterThanZero(side3)) {
			if ((side1.add(side2)).compareTo(side3)==1 && (side2.add(side3)).compareTo(side1)==1 && (side3.add(side1)).compareTo(side2)==1) {
				return true;
			}
		}
		return false;
	}

	//The following function returns the type of triangle based on the 
	//sides provided as input.
	public TriangleType typeOfTriangle() {
		if (!conditionChecks()) {
			return TriangleType.NO_TRIANGLE;
		}
		if (side1.compareTo(side2)==0 && side1.compareTo(side3)==0) {
			return TriangleType.EQUILATERAL;
		} else if (side1.compareTo(side2)==0 || side1.compareTo(side3)==0 || side2.compareTo(side3)==0) {
			return TriangleType.ISOSCELES;
		} else {
			return TriangleType.SCALENE;
		}
	}
}