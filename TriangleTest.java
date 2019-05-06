import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

class TriangleTest {

	@Test
	public void equilateralTest1()
	{
		Triangle t = new Triangle (12,12,12);
		Assert.assertEquals("\nSides: " + 12 + " " + 12 + " " + 12,"equilateral", t.classify());
	}
	

}
