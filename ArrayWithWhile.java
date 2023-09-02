import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayWithWhile {
    /*
    * Написать программу, в результате которой массив чисел вводится
    * пользователем с клавиатуры считается сумма элементов целочисленного
    * массива с помощью циклов do while, while, также необходимо найти
    * максимальный и минимальный элемент в массиве, результат выводится на экран.
    * */

    public static void main(String[] args) {
        var in = new Scanner(System.in);

        var arr = new ArrayList<Integer>();
        var maxElement = Integer.MIN_VALUE;
        var minElement = Integer.MAX_VALUE;
        var sum = 0;

        System.out.println(
            "Enter numbers of array splitted with space and click Ctrl+D after the last number:"
        );
        while (in.hasNextInt()) {
            var el = in.nextInt();
            arr.add(el);

            maxElement = Integer.max(maxElement, el);
            minElement = Integer.min(minElement, el);
            sum += el;
        }

        System.out.printf(
            "Sum = %d\nMax element = %d\nMin element = %d\n",
            sum, maxElement, minElement
        );
    }
}
