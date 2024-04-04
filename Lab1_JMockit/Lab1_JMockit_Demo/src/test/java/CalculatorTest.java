/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nakyumdepzaii
 */
import mockit.Expectations;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();

        new Expectations() {{
            // Mocking the add method
            calculator.add(anyInt, anyInt);
            result = 42; // Return value when add is called with any integers
        }};

        int result = calculator.add(10, 20);

        // Assertion
        assertEquals(42, result);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();

        new Expectations() {{
            // Mocking the multiply method
            calculator.multiply(anyInt, anyInt);
            result = 30; // Return value when multiply is called with any integers
        }};

        int result = calculator.multiply(3, 10);

        // Assertion
        assertEquals(30, result);
    }

    @Test
    public void testStringConcatenation() {
        Calculator calculator = new Calculator();

        new Expectations() {{
            // Mocking the concatenateStrings method
            calculator.concatenateStrings(anyString, anyString);
            result = "Hello, World!"; // Return value when concatenateStrings is called with any strings
        }};

        String result = calculator.concatenateStrings("Hello, ", "World!");

        // Assertion
        assertEquals("Hello, World!", result);
    }
}
