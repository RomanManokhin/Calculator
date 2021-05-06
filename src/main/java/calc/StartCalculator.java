package calc;


public class StartCalculator {

    public static void main(String[] args) throws Exception {

        Initializer initializer = new Initializer();

        while (true) {
            System.out.println("Введите данные для расчета");
            System.out.println(initializer.initCalc());
        }
    }

}
