package br.edu.univas;
import java.util.Scanner;

public class menorPosicao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[scan.nextInt()];
        int menor = 0;
        int posicao = 0;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scan.nextInt();

            if (i == 0) {
                menor = valores[i];
                posicao = i;
            } else {
                if (valores[i] < menor) {
                    menor = valores[i];
                    posicao = i;
                }
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
    }
}
