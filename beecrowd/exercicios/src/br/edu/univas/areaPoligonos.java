package br.edu.univas;

import java.util.Scanner;

public class areaPoligonos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("==== Digite o número referente ao cálculo de área desejado ====");
            System.out.println("Opção 1: Quadrado");
            System.out.println("Opção 2: Triângulo equilátero");
            System.out.println("Opção 3: Retângulo");
            System.out.println("Opção 4: Trapézio");
            System.out.println("Opção 9: Sair\n");
            opcao = scan.nextInt();

            float resultado;
            float base;
            float altura;

            switch (opcao) {
                case 1:
                    System.out.println("Digite a medida dos lados:");
                    base = scan.nextFloat();
                    resultado = base * base;
                    System.out.println("A área do quadrado é igual a: " + resultado + "\n");
                    break;
                case 2:
                    System.out.println("Digite a medida da base:");
                    base = scan.nextFloat();
                    System.out.println("Digite a medida da altura:");
                    altura = scan.nextFloat();
                    resultado = (base * altura) / 2;
                    System.out.println("A área do triângulo equilátero é igual a: " + resultado + "\n");
                    break;
                case 3:
                    System.out.println("Digite a medida da base:");
                    base = scan.nextFloat();
                    System.out.println("Digite a medida da altura:");
                    altura = scan.nextFloat();
                    resultado = base * altura;
                    System.out.println("A área do retângulo é igual a: " + resultado + "\n");
                    break;
                case 4:
                    System.out.println("Digite a medida da base maior:");
                    base = scan.nextFloat();
                    System.out.println("Digite a medida da base menor:");
                    int baseMenor = scan.nextInt();
                    System.out.println("Digite a medida da altura:");
                    altura = scan.nextFloat();
                    resultado = ((base + baseMenor) * altura) / 2;
                    System.out.println("A área do trapézio é igual a: " + resultado + "\n");
                    break;
                case 9:
                    System.out.println("Operações finalizadas, adeus!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, digite uma opção correta!\n");
            }

        } while (opcao != 9);
    }
}
