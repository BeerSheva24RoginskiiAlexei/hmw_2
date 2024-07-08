package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static telran.introduction.Calculations.*;

public class CalculationsTest {
    @Test
    void testSum() {
        assertEquals(4, sum(2, 2));
    }
    @Test
    void testMultiply() {
        assertEquals(6, multiply(2,3));
    }
    @Test
    void testDivide() {
        assertEquals(3, divide(6,2));
        assertEquals(0, divide(6,0));   
    }
    @Test
    void testSubtract() {
        assertEquals(5, subtract(10,5));
    }
    @Test
    void testSumOfDigits(){
        assertEquals(6, sumOfDigits(123));
        assertEquals(6, sumOfDigits(-123));
    }
    @Test
    void testMaxDigits(){
        assertEquals(3, maxDigits(123));
        assertEquals(3, maxDigits(-123));
    }
    @Test
    void testIsDividedOn(){
        assertEquals(true, isDividedOn(12,4));
        assertEquals(false, isDividedOn(10,4));
    }
}

