package br.edu.univas;
import java.util.Scanner;

public class blobs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int[] dias = new int[casos];

        for (int i = 0 ; i < casos; i++) {
            float quantidade = scan.nextFloat();

            for (float j = quantidade; j >= 1;) {
                j /= 2;
                dias[i]++;
            }
        }

        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i] + " dias");
        }
    }
}
