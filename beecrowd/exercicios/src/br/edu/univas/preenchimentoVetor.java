package br.edu.univas;
import java.util.Scanner;

public class preenchimentoVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[10];
        valores[0] = scan.nextInt();

        for (int i = 1; i < valores.length; i++) {
            valores[i] = valores[i - 1] * 2;
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println("N[" + i +  "] = " + valores[i]);
        }
    }
}
