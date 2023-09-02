public class PrintCmdLineArgs {
    /*
    * Написать программу, в результате которой выводятся на экран
    * аргументы командной строки в цикле for.
    * */
    public static void main(String[] args) {
        System.out.println("Command line arguments:");
        for (var s : args) {
            System.out.println(s);
        }
    }
}
