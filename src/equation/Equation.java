package equation;

import java.util.Scanner;

/**
 *
 * @author PM051
 */
public class Equation {

    public static void main(String[] args) {
        System.out.println("a*x^2 + b*x + c = -7");

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = Double.parseDouble(reader.nextLine());
        System.out.print("Введите b: ");
        double b = Double.parseDouble(reader.nextLine());
        System.out.print("Введите c: ");
        double c = Double.parseDouble(reader.nextLine());

        double[] korni = solution(a, b, c);
        switch (korni.length) {
            case 0:
                System.out.println("Решений нет");
                break;
            case 1:
                System.out.println("x = " + korni[0]);
                break;
            case 2:
                System.out.println("x1 = " + korni[0] + "\n" + "x2 = " + korni[1]);
        }
    }

    public static double[] solution(double a, double b, double c) {
        c += 7;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    throw new ArithmeticException("x - любое число");
                } else {
                    return new double[]{};
                }
            } else {
                double x = -c / b;
                return new double[]{x};
            }
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant < 0 - 1e-3) {
                return new double[]{};
            } else if (discriminant > 0 + 1e-3) {
                double disc = Math.sqrt(discriminant);
                double x1 = (-b + disc) / (2 * a);
                double x2 = (-b - disc) / (2 * a);
                return new double[]{x1, x2};
            }
        }
        double x = -b / (2 * a);
        return new double[]{x};
    }
}
