import java.util.Scanner;

public class Changermoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so tien USD");

        usd = scanner.nextDouble();
        double exchange = usd * vnd;
        System.out.println("Gia tri VND " + exchange);
    }
}
