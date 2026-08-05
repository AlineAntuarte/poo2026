package Java.Aula02;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ex01
 */
public class Ex01 {
    Scanner leia = new Scanner(System.in);
    ArrayList<String> Jogos = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== Bem vindo ===");
        System.out.println("Selecione uma alternativa de 1 a 5.");
        System.out.print(
                "1 - Cadastrar Jogo\n2 - Listar Jogos\n3 - Atualizar Jogo\n4 - Remover Jogo\n5 - Sair\n\nOpção: ");
        int userInt = leia.nextInt();

        switch (userInt) {
            case 1:

                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            default:
                break;
        }

    }

    public void Cadastro(String nome) {
        System.out.print("Quantos jogos deseja cadastrar? Insira valor > 0: ");
        int qtdJogosCad = leia.nextInt();
        String userString = leia.nextLine();
        for (int i = 0; i < qtdJogosCad; i++) {
            System.out.print("Insira o nome do jogo que deseja cadastrar: ");
            userString = leia.nextLine();
            Jogos.add(userString);
        }
    }
    leia.close();
}