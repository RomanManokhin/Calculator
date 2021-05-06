package calc;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {

    UserInput userInput = new UserInput();
    Throwable thrown;

    @Test
    void testParserStringOkInputArabic() throws Exception {
        String input = "2 + 2";
        String[] excepted = {"2", "+", "2"};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);
        String[] actual = userInput.parserString();

        assertArrayEquals(excepted, actual);

    }

    @Test
    void testParserStringOkInputRoman() throws Exception {
        String input = "II + II";
        String[] excepted = {"II", "+", "II"};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);
        String[] actual = userInput.parserString();

        assertArrayEquals(excepted, actual);

    }

    @Test
    void testParserStringWrongInput() throws Exception {
        String input = "2 + 2";
        String[] excepted = {"2", "+", "2"};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);
        String[] actual = userInput.parserString();

        assertArrayEquals(excepted, actual);

    }

    @Test
    void testParserStringWrongInputBigLine() {
        String input = "2 + 2 + 3";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);

        thrown = assertThrows(Exception.class, () -> userInput.parserString());

    }

    @Test
    void userInput() throws IOException {

        String excepted = "II + II";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(excepted.getBytes());
        System.setIn(byteArrayInputStream);

        String actual = userInput.userInput();

        assertEquals(excepted, actual);

    }
}