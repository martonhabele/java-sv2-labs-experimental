package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        try {
            System.out.print("First number: ");
            a = sc.nextInt();
            System.out.print("Second number: ");
            b = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println(ime.getCause().toString());
        }

        System.out.println("1 : +\n2 : -\n3 : *\n4 : /");

        try {
            switch (sc.nextInt()) {
                case 1 -> System.out.println(a + b);
                case 2 -> System.out.println(a - b);
                case 3 -> System.out.println(a * b);
                case 4 -> System.out.println(a / b);
                default -> System.out.println("Invalid option!");
            }
        } catch (InputMismatchException ime) {
            System.out.println(ime.getCause().toString());
        }
        sc.close();
    }
}