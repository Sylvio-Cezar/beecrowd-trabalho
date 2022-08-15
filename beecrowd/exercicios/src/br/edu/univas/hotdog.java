package br.edu.univas;
import java.util.Scanner;

public class hotdog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int p = scan.nextInt();

        float media = (float)h/p;

        System.out.printf("%.2f\n", media);
    }
}
