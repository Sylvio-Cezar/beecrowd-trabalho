package br.edu.univas;
import java.util.Scanner;

public class tempoDeJogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horas = 0;
        int inicio = scan.nextInt();
        int fim = scan.nextInt();

        if (inicio < fim) {
            horas = fim - inicio;
        } else if (inicio > fim) {
            while (inicio < 24) {
                horas++;
                inicio++;
            }
            inicio = 0;
            while (inicio < fim) {
                horas++;
                inicio++;
            }
        } else {
            horas = 24;
        }

        System.out.println("O JOGO DUROU " + horas + " HORA(S)");
    }
}
