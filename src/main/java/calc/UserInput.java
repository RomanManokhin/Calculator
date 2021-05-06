package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Класс для получения данных от пользователя и их проверки
 * */
public class UserInput {

    /**
     * Метод для проверки введённых пользователем данных
     * */
    public String[] parserString() throws Exception {

        String userInput = userInput();

        String[] valuesOfUserInput = userInput.split(" ");

        if (valuesOfUserInput.length != 3) throw new Exception("Не корректный ввод");

        return valuesOfUserInput;

    }

    /**
     * Метод для получения данных от пользователя
     * */
    public String userInput() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        return bufferedReader.readLine();
    }


}
