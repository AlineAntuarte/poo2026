package Java.Aula02;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ex01
 */
public class Ex01 {
    static Scanner leia = new Scanner(System.in);
    static ArrayList<String> Jogos = new ArrayList<>();
    static boolean Trava = true;

    public static void main(String[] args) {

        System.out.println("=== Bem vindo ===");

        while (Trava) {
            System.out.println("\nSelecione uma alternativa de 1 a 5.");
            System.out.print(
                    "1 - Cadastrar Jogo\n2 - Listar Jogos\n3 - Atualizar Jogo\n4 - Remover Jogo\n5 - Sair\n\nOpção: ");
            int userInt = leia.nextInt();

            switch (userInt) {
                case 1:
                    Cadastro();
                    break;

                case 2:
                    Listar();
                    break;

                case 3:
                    Atualizar();
                    break;

                case 4:
                    Remover();
                    break;

                case 5:
                    Sair();
                    leia.close();
                    break;

                default:
                    System.out.println("Opção inválida...");
                    break;
            }
        }

    }

    public static void Cadastro() {
        System.out.print("Quantos jogos deseja cadastrar: ");
        int qtdJogosCad = leia.nextInt();
        String userString = leia.nextLine();
        for (int i = 0; i < qtdJogosCad; i++) {
            System.out.print("Insira o nome do jogo que deseja cadastrar: " + (i + 1) + "º - ");
            userString = leia.nextLine();
            Jogos.add(userString);
        }
    }

    public static void Listar() {
        System.out.println("> Lista de Jogos <");

        for (int i = 0; i < Jogos.size(); i++) {
            System.out.print((i + 1) + "º - " + Jogos.get(i) + "\n");
        }
    }

    public static void Atualizar() {

    }

    public static void Remover() {

    }

    public static void Sair() {
        System.out.println("Saindo...");
        Trava = false;
    }

}