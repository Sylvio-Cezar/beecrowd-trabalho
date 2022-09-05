package br.edu.univas;
import java.util.Scanner;

public class trocaVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[10];
        int tamanhoVetor = valores.length;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scan.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            tamanhoVetor--;
            valores[i] = valores[tamanhoVetor];
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println("N[" + i +  "] = " + valores[i]);
        }
    }
}
