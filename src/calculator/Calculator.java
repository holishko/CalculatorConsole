package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    double a = 0.0;
    double b = 0.0;
    double w = 0.0;
    String k = null;

    History history = new History();

    public void Calc() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число :");
        while (true) {
            String j = bufferedReader.readLine();
            try {
                a = Double.parseDouble(j);
                break;
            } catch (NumberFormatException n) {
                System.out.println("Введите правельно первое число :");
            }
        }

        while (true) {
            System.out.println("Введите операцию : \n +  -  *  /");
            k = bufferedReader.readLine();
            if (k.equals("-") || k.equals("+") || k.equals("*") || k.equals("/")) {
                break;
            }
        }

        System.out.println("Введите второе число :");
        while (true) {
            String j = bufferedReader.readLine();
            try {
                if (!j.equals(null)) {
                    b = Double.parseDouble(j);
                    if (b != 0) {
                        switch (k) {
                            case "+":
                                w = a + b;
                                break;
                            case "-":
                                w = a - b;
                                break;
                            case "*":
                                w = a * b;
                                break;
                            case "/":
                                w = a / b;
                                break;
                            default:
                        }
                        System.out.println("res : " + w);
                        history.his(w);
                        System.out.println();
                    } else {
                        System.out.println("На ноль не делится !");
                        System.out.println("Введите правельно второе число :");
                        continue;
                    }
                }
                break;
            } catch (NumberFormatException n) {
                System.out.println("Введите правельно второе число :");
                continue;
            }
        }
    }
}
