package br.edu.univas;
import java.util.Scanner;

public class fusoHorario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int saida = scan.nextInt();
        int tempo = scan.nextInt();
        int fuso = scan.nextInt();

        int chegada = saida + tempo + fuso;

        if (chegada > 23) {
            chegada -= 24;
        } else if (chegada < 0) {
            chegada += 24;
        }

        System.out.println(chegada);
    }
}
