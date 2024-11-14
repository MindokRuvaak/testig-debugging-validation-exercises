package tdbv.exc1;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TriangleCheckerTest {
    @Test
    void testIsEquilateral() {
        assertTrue(TriangleChecker.isEquilateral(2,2,2));
        assertFalse(TriangleChecker.isEquilateral(1,2,2));
        assertFalse(TriangleChecker.isEquilateral(2,1,2));
        assertFalse(TriangleChecker.isEquilateral(2,2,1));

        // assertThrows(IllegalArgumentException.class, () -> TriangleChecker.isEquilateral(1, 0, 1));
        // assertThrows(IllegalArgumentException.class, () -> TriangleChecker.isEquilateral(0, 1, 1));
        // assertThrows(IllegalArgumentException.class, () -> TriangleChecker.isEquilateral(0, 1, 1));

        // assertThrows(IllegalArgumentException.class, () -> TriangleChecker.isEquilateral(0, 0, 0));

        
    }

    @Test
    void testIsIsosceles() {

    }

    @Test
    void testIsScalene() {

    }

    @Test
    void testMain() {
        
    }
}
