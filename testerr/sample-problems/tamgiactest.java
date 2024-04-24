import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class tamgiactest {

    @Test
    public void testTriangleType() {
        assertEquals("Equilateral", tamgiac.triangleType(5, 5, 5));
        assertEquals("Isosceles", tamgiac.triangleType(5, 5, 7));
        assertEquals("NotATriangle", tamgiac.triangleType(1, 2, 3));
        assertEquals("Scalene", tamgiac.triangleType(3, 4, 6));
        assertEquals("RightTriangle", tamgiac.triangleType(3, 4, 5));
    }
}
