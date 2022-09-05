package br.edu.univas;
import java.util.Scanner;

public class funcoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] casos = new int[scan.nextInt()];

        for (int i = 0; i < casos.length; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            int r = ((3 * x) * (3 * x)) + (y * y);
            int b = 2 * (x * x) + ((5 * y) * (5 * y));
            int c = -100 * x + (y * y * y);

            if (r > b && r > c) {
                System.out.println("Rafael ganhou");
            } else if (b > r && b > c) {
                System.out.println("Beto ganhou");
            } else {
                System.out.println("Carlos ganhou");
            }
        }
    }
}
