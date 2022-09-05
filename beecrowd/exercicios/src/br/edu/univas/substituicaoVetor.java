package br.edu.univas;
import java.util.Scanner;

public class substituicaoVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[10];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scan.nextInt();

            if (valores[i] < 0 || valores[i] == 0) {
                valores[i] = 1;
            }
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println("X[" + i +  "] = " + valores[i]);
        }
    }
}
