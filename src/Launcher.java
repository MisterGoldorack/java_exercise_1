import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Welcome to the First Exercise");

        for (;;) {
            var scanner = new Scanner(System.in);

            if (scanner.next().equals("quit")) {
                System.exit(0);
            } else if (scanner.next().equals("fibo")) {
                System.out.println("Choose a n value !");
                int n = scanner.nextInt();
                System.out.println("Fibo(" + n + ") = " + Fibo.fibo(n));
            } else if (scanner.next().equals("freq")) {
                System.out.println("Select a valid file path");
            } else {
                System.out.println("Unknow Command");
            }
        }
    }
}
