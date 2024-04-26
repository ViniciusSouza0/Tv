package com.mycompany.televisao;
import java.util.Scanner;
public class Televisao {
public static void main(String[] args) {
    
        Tv minhaTV = new Tv();
        ControleRemoto meuControle = new ControleRemoto(minhaTV);

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Ligar TV");
            System.out.println("2 - Desligar TV");
            System.out.println("3 - Aumentar Volume");
            System.out.println("4 - Diminuir Volume");
            System.out.println("5 - Trocar de Canal");
            System.out.println("0 - Desligar TV");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    meuControle.ligarTV();
                    break;
                case 2:
                    meuControle.desligarTV();
                    break;
                case 3:
                    meuControle.aumentarVolume();
                    break;
                case 4:
                    meuControle.diminuirVolume();
                    break;
                case 5:
                    System.out.print("Digite o novo canal: ");
                    int novoCanal = scanner.nextInt();
                    meuControle.trocarCanal(novoCanal);
                    break;
                case 0:
                    System.out.println("TV Desligando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
    
