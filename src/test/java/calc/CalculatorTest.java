package calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    Calculator calculator = new Calculator();
    Throwable thrown;

    @Test
    void calculateArabicAddition() throws Exception {

        String first = "10";
        String second = "5";
        String sign = "+";
        int type = 0;

        String actual = "15";
        String expected = calculator.calculate(first, sign, second, type);

        assertEquals(expected, actual);

    }

    @Test
    void calculateArabicSubtraction() throws Exception {

        String first = "10";
        String second = "5";
        String sign = "-";
        int type = 0;

        String actual = "5";
        String expected = calculator.calculate(first, sign, second, type);

        assertEquals(expected, actual);

    }

    @Test
    void calculateArabicMultiplication() throws Exception {

        String first = "10";
        String second = "5";
        String sign = "*";
        int type = 0;

        String actual = "50";
        String expected = calculator.calculate(first, sign, second, type);

        assertEquals(expected, actual);

    }

    @Test
    void calculateArabicDivision() throws Exception {

        String first = "10";
        String second = "5";
        String sign = "/";
        int type = 0;

        String actual = "2";
        String expected = calculator.calculate(first, sign, second, type);

        assertEquals(expected, actual);

    }

    @Test
    void calculateRomanAddition() throws Exception {

        String first = "10";
        String second = "5";
        String sign = "+";
        int type = 1;

        String actual = "XV";
        String expected = calculator.calculate(first, sign, second, type);

        assertEquals(expected, actual);

    }

    @Test
    void calculateRomanSubtraction() throws Exception {

        String first = "10";
        String second = "5";
        String sign = "-";
        int type = 1;

        String actual = "V";
        String expected = calculator.calculate(first, sign, second, type);

        assertEquals(expected, actual);

    }

    @Test
    void calculateRomanMultiplication() throws Exception {

        String first = "10";
        String second = "5";
        String sign = "*";
        int type = 1;

        String actual = "L";
        String expected = calculator.calculate(first, sign, second, type);

        assertEquals(expected, actual);

    }

    @Test
    void calculateRomanDivision() throws Exception {

        String first = "10";
        String second = "5";
        String sign = "/";
        int type = 1;

        String actual = "II";
        String expected = calculator.calculate(first, sign, second, type);

        assertEquals(expected, actual);

    }

    @Test
    void calculateArabicAndRoman() {

        String first = "10";
        String second = "V";
        String sign = "+";
        int type = 0;

        thrown = assertThrows(Exception.class, () -> calculator.calculate(first, sign, second, type));

        String first1 = "V";
        String second1 = "10";
        String sign1 = "+";
        int type1 = 1;

        thrown = assertThrows(Exception.class, () -> calculator.calculate(first1, sign1, second1, type1));


    }

    @Test
    void calculateCheckSign() {

        String first = "10";
        String second = "5";
        String sign = "-*";
        int type = 0;

        thrown = assertThrows(Exception.class, () -> calculator.calculate(first, sign, second, type));
    }


    @Test
    void calculateRomanSubtractionFirstNumberLessSecondNumber(){

        String first = "5";
        String second = "10";
        String sign = "-";
        int type = 1;

        thrown = assertThrows(NullPointerException.class, () -> calculator.calculate(first, sign, second, type));

    }
}