import java.util.Scanner;

public class Factorial {
    /*
    * Написать программу, которая с помощью метода класса, вычисляет
    * факториал числа (использовать управляющую конструкцию цикла), проверить
    * работу метода.
    * */
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.println("Method tests:");
        System.out.printf("0! = 1: %s\n", factorial(0) == 1 ? "OK" : "ERROR");
        System.out.printf("1! = 1: %s\n", factorial(1) == 1 ? "OK" : "ERROR");
        System.out.printf("2! = 2: %s\n", factorial(2) == 2 ? "OK" : "ERROR");
        System.out.printf("5! = 120: %s\n", factorial(5) == 120 ? "OK" : "ERROR");

        System.out.print("Enter your number >> ");
        var n = in.nextInt();
        if (n < 0) {
            System.out.println("Number must be greater then 0.");
            return;
        }
        if (n > 20) {
            System.out.println("Number must be less then or equal 20.");
            return;
        }
        System.out.printf("%d! = %d\n", n, factorial(n));
    }

    public static long factorial(int n) {
        var result = 1L;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
