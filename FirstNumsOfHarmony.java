public class FirstNumsOfHarmony {
    /*
    * Написать программу, в результате работы которой выводятся на экран
    * первые 10 чисел гармонического ряда (форматировать вывод).
    * */
    public static void main(String[] args) {
        System.out.println("First 10 numbers of Harmonic row:");
        double num = 0;
        for (int i = 1; i <= 10; i++) {
            num += (double) 1 / i;
            System.out.printf("H%d = %.3f\n", i, num);
        }
    }
}
