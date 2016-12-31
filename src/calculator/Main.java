package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Calculator cl = new Calculator();
        History history = new History();
        while (true) {

            System.out.println(" Выбрать Калькулятор нажав 1\n Просмотреть Историю нажав 2 \n Выход из программы нажать e");
            String j = bufferedReader.readLine();

            if (j.equals("e")) {
                return;
            }
            switch (j) {
                case "1":
                    cl.Calc();
                    break;
                case "2":
                    history.clenmenu();
                    break;
                default:
            }
        }
    }
}
