package Java.Aula02;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ex01
 */
public class Ex01 {
    static Scanner leia = new Scanner(System.in);
    static ArrayList<String> Jogos = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== Bem vindo ===");
        System.out.println("Selecione uma alternativa de 1 a 5.");
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
                break;
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

    }

    public static void Atualizar() {

    }

    public static void Remover() {

    }

    public static void Sair() {

    }

}