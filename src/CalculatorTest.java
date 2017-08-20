import static org.junit.Assert.assertEquals;
import org.junit.Test;

// In order to run the Unit tests from the command line:
// I have downloaded the junit.jar and hamcrest-core-1.3.jar locally
// 1 compile:
// ----------
// $ javac Calculator.java
// $ javac -cp .:./junit.jar CalculatorTest.java
// 2 run:
// ------
// $ java -cp .:./junit.jar:./hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest
//
public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }  
}
