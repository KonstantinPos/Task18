import sun.plugin.javascript.navig.Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int c = scanner.nextInt();
        System.out.println("Числа в переменных a, b и c: " + a + ", " + b + ", " + c);
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Возрастающая последовательность " + c + " " + b + " " + a);
            } else {
                System.out.println("Возрастающая последовательность " + b + " " + c + " " + a);
            }
        }
        if (b > c && b > a) {
            if (c > a) {
                System.out.println("Возрастающая последовательность " + a + " " + c + " " + b);
            } else {
                System.out.println("Возрастающая последовательность " + c + " " + a + " " + b);
            }
        }
        if (c > a && c > b) {
            if (a > b) {
                System.out.println("Возрастающая последовательность " + b + " " + a + " " + c);
            } else {
                System.out.println("Возрастающая последовательность " + a + " " + b + " " + c);
            }
        }
    }
}
