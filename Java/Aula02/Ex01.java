package Java.Aula02;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ex01
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> Jogos = new ArrayList<>();

        System.out.println("=== Bem vindo ===");
        System.out.println("Selecione uma alternativa de 1 a 5.");
        System.out.print(
                "1 - Cadastrar Jogo\n2 - Listar Jogos\n3 - Atualizar Jogo\n4 - Remover Jogo\n5 - Sair\n\nOpção: ");
        int userInt = leia.nextInt();

        switch (userInt) {
            case 1:
                System.out.print("Quantos jogos deseja cadastrar? Insira valor > 0: ");
                int qtdJogosCad = leia.nextInt();
                String userString = leia.nextLine();
                
                System.out.print("Insira o nome do jogo que deseja cadastrar: ");
                userString = leia.nextLine();
                Jogos.add(userString);
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
        leia.close();
    }
}