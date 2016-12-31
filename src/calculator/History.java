package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class History {

    private static double[] f = new double[1];
    private static double[] v = new double[f.length + 1];

    public static void his(double w) {
        Double e = w;
        f[f.length - 1] = e;
        v = new double[f.length + 1];
        for (int i = 0; i < f.length; i++) {
            v[i] = f[i];
        }
        f = v;
        v[f.length - 1] = 0;
    }

    public static void clenmenu() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < f.length - 1; i++) {
            System.out.println("res: " + f[i]);
        }
        if (f.length == 1) {
            System.out.println("История пустая !!!!!");
            return;
        }

        System.out.println(" Удалить историю нажать 2 \n Вернутся в Предыдущее меню Entr !!!");
        String j = bufferedReader.readLine();
        switch (j) {
            case "2":
                f = new double[f.length];
                v = new double[1];
                for (int i = 0; i < v.length; i++) {
                    f[i] = v[i];
                }
                f = v;
                System.out.println("История Удалена !!!");
                break;
            default:
        }
    }
}
