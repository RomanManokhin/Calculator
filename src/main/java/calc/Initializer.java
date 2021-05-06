package calc;

/**
 * Класс для инициализации программы
 */
public class Initializer {

    UserInput userInput = new UserInput();

    /**
     * Метод для инициализации калькулятора
     * */
    public String initCalc() throws Exception {
        Calculator calculator = new Calculator();
        NumberConverter nc = new NumberConverter();

        String[] array = userInput.parserString();

        return calculator.calculate(array[0], array[1], array[2], nc.check(array[0]));
    }

}
