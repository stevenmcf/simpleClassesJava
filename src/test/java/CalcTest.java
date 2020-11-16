import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {
    Calculator calc;

    @Before
    public void before() {
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(25, calc.addNumbers(10, 15));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calc.subtractNumbers(5, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(10, calc.multiplyNumbers(2, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(2, calc.divideNumbers(10, 5),0.00);
    }

}


