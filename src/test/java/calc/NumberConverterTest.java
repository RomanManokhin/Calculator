package calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumberConverterTest {

    NumberConverter numberConverter = new NumberConverter();

    Throwable thrown;

    @Test
    void convertToNumberArabic() throws Exception {

        int actual = 10;

        int expected = numberConverter.convertToNumber("10");

        assertEquals(expected, actual);

    }

    @Test
    void convertToNumberRoman() throws Exception {
        int actual = 10;

        int expected = numberConverter.convertToNumber("X");

        assertEquals(expected, actual);

    }

    @Test
    void convertToNumberArabicMoreTen() {
        String expected = "15";
        String expected1 = "-1";

        thrown = assertThrows(Exception.class, () -> numberConverter.convertToNumber(expected));
        thrown = assertThrows(Exception.class, () -> numberConverter.convertToNumber(expected1));
    }


    @Test
    void convertToNumberRomanMoreTen() {
        String expected = "XI";

        thrown = assertThrows(Exception.class, () -> numberConverter.convertToNumber(expected));
    }

    @Test
    void romanToArabicRightNumber() throws Exception {
        int expected = 11;

        int actual = numberConverter.romanToArabicNumber("XI");

        assertEquals(expected, actual);

    }

    @Test
    void romanToArabicTestForIV() {
        String expected = "IIII";

        thrown = assertThrows(Exception.class, () -> numberConverter.romanToArabicNumber(expected));
    }

    @Test
    void romanToArabicSymbolRightArabicSymbol(){
        int actual = 5;
        int expected = numberConverter.romanToArabicSymbol('V');

        assertEquals(expected, actual);
    }

    @Test
    void romanToArabicSymbolWrongArabicSymbol(){
        int actual = -1;
        int expected = numberConverter.romanToArabicSymbol('G');

        assertEquals(expected, actual);
    }

    @Test
    void check() {
        int actual1 = 0;
        int expected1 = numberConverter.check("10");
        assertEquals(expected1, actual1);

        int actual2 = 0;
        int expected2 = numberConverter.check("10");
        assertEquals(expected2, actual2);
    }

    @Test
    void arabicNumberToRoman() {
        String actual = "LXXXVI";
        String excepted = numberConverter.arabicNumberToRoman(86);

        assertEquals(excepted, actual);
    }
}