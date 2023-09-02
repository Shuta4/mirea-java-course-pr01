import java.util.Scanner;

public class ArrayLikeInC {
    /*
    * Написать программу, в результате которой массив чисел создается с
    * помощью инициализации (как в Си) вводится и считается в цикле сумма
    * элементов целочисленного массива, а также среднее арифметическое его
    * элементов результат выводится на экран. Использовать цикл for.
    * */
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter number of elements in array >> ");
        var n = in.nextInt();

        int sum = 0;
        var arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter %d element of array >> ", i + 1);
            arr[i] = in.nextInt();
            sum += arr[i];
        }

        System.out.printf(
            "Sum of elements is %d.\nMean is %.3f.\n",
            sum, (double) sum / n
        );
    }
}
