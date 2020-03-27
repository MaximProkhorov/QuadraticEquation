
import org.junit.Test;
import equation.Equation;
import org.junit.Assert;

/**
 *
 * @author PM051
 */
public class EquationTest {

    public EquationTest() {
    }

    @Test(expected = ArithmeticException.class)
    public void infiniteSolutionsShouldThrowException() {
        Equation.solution(0, 0, -7);
    }

    @Test
    public void methodShouldReturnZeroRoots() {
        Assert.assertArrayEquals(new double[]{}, Equation.solution(10.345, -0.452, 567.345), 1e-9);
    }

    @Test
    public void methodShouldReturnOneRoot() {
        Assert.assertArrayEquals(new double[]{3}, Equation.solution(0.0014285714285714, -0.0085714285714286, -7.0128571428571429), 1e-9);
    }

    @Test
    public void methodShouldReturnTwoRoots() {
        Assert.assertArrayEquals(new double[]{59.66479394838265, 0.33520605161734807}, Equation.solution(1, -60, 13), 1e-9);
    }
}
