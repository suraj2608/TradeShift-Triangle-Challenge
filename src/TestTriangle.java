import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Locale.Category;

public class TestTriangle {
  
   @Test
   public void testValidSides() {
      BigDecimal side1 = new BigDecimal("3");
      BigDecimal side2 = new BigDecimal("4");
      BigDecimal side3 = new BigDecimal("5");

      Triangle t1 = new Triangle(side1, side1, side1);
      assertTrue(t1.conditionChecks());
      Triangle t2 = new Triangle(side2, side3, side3);
      assertTrue(t2.conditionChecks());
      Triangle t3 = new Triangle(side1, side2, side3);
      assertTrue(t3.conditionChecks());
   }

   @Test
   public void testNegativeSides() {
      BigDecimal side1 = new BigDecimal("-3");
      BigDecimal side2 = new BigDecimal("4");
      BigDecimal side3 = new BigDecimal("5");

      //All sides are negative
      Triangle t1 = new Triangle(side1, side1, side1);
      assertFalse(t1.conditionChecks());
      //Two sides are negative
      Triangle t2 = new Triangle(side2, side1, side1);
      assertFalse(t2.conditionChecks());
      //One side is negative
      Triangle t3 = new Triangle(side1, side2, side3);
      assertFalse(t3.conditionChecks());
   }

   @Test
   public void testZeroSides() {
      BigDecimal side1 = new BigDecimal("0");
      BigDecimal side2 = new BigDecimal("4");
      BigDecimal side3 = new BigDecimal("5");

      //All sides are zero
      Triangle t1 = new Triangle(side1, side1, side1);
      assertFalse(t1.conditionChecks());
      //Two sides are zero
      Triangle t2 = new Triangle(side2, side1, side1);
      assertFalse(t2.conditionChecks());
      //One side is zero
      Triangle t3 = new Triangle(side1, side2, side3);
      assertFalse(t3.conditionChecks());
   }

   @Test
   public void testTwoSidesSumLessThanThird() {
      BigDecimal side1 = new BigDecimal("1.5");
      BigDecimal side2 = new BigDecimal("4");
      BigDecimal side3 = new BigDecimal("7");

      Triangle t1 = new Triangle(side1, side2, side3);
      assertFalse(t1.conditionChecks());
      Triangle t2 = new Triangle(side1, side1, side3);
      assertFalse(t2.conditionChecks());
   }

   @Test
   public void testTriangleType() {
      
	  TriangleType eq = TriangleType.EQUILATERAL;
	  TriangleType is = TriangleType.ISOSCELES;
	  TriangleType sc = TriangleType.SCALENE;
	  TriangleType nt = TriangleType.NO_TRIANGLE;
	   
      BigDecimal side1 = new BigDecimal("10");
      BigDecimal side2 = new BigDecimal("13");
      BigDecimal side3 = new BigDecimal("14");
      BigDecimal side4 = new BigDecimal("15");
      BigDecimal side5 = new BigDecimal("0");
     
      // Equilateral triangle
      Triangle t1 = new Triangle(side1, side1, side1);
      assertEquals(eq, t1.typeOfTriangle());
      // Isosceles triangle
      Triangle t2 = new Triangle(side1, side1, side3);
      assertEquals(is, t2.typeOfTriangle());
      // Scalene triangle
      Triangle t3 = new Triangle(side1, side2, side3);
      assertEquals(sc, t3.typeOfTriangle());
      // Broken triangle
      Triangle tri4 = new Triangle(side5, side5, side1);
      assertEquals(nt, tri4.typeOfTriangle());
   }
}