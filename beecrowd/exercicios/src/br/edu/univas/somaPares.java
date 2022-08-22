package br.edu.univas;
import java.util.Scanner;

public class somaPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int soma = 0;

        do {
            x = scan.nextInt();

            if (x % 2 == 0) {
                soma += x;
                for (int i = 0; i <= 5; i++) {
                    x += 2;
                    soma += x;

                    System.out.println(soma);
                }
            } else {
                x++;
                soma += x;
                for (int i = 0; i <= 5; i++) {
                    x += 2;
                    soma += x;

                    System.out.println(soma);
                }
            }

            System.out.println(soma);

            soma = 0;
        } while (x != 0);
    }
}
