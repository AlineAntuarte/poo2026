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
            System.out.println("\n\nSelecione uma alternativa de 1 a 5.");
            System.out.print(
                    "1 - Cadastrar Jogo\n2 - Listar Jogos\n3 - Atualizar Jogo (Indice)\n4 - Atualizar (Nome)\n5 - Remover Jogo (Indice)\n6 - Remover Jogo (Nome)\n7 - Sair\n\nOpção: ");
            int userIntSwitch = leia.nextInt();
            leia.nextLine(); // Limpar buffer
            System.out.println("\n");

            switch (userIntSwitch) {
                case 1:
                    Cadastro();
                    break;

                case 2:
                    Listar();
                    break;

                case 3:
                    AtualizarPorIndice();
                    break;

                case 4:
                    AtualizarPorNome();
                    break;

                case 5:
                    RemoverPorIndice();

                    break;

                case 6:
                    RemoverPorNome();
                    break;

                case 7:
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

            boolean jogoExiste = false;

            for (String jogoDaListaTemporario : Jogos) { // Um for mais limpo
                if (jogoDaListaTemporario.equalsIgnoreCase(userString)) {
                    jogoExiste = true;
                    break;
                    // Encerra ao achar o primeiro jogo repetido
                }

            }

            if (jogoExiste) {
                System.out.println("O jogo '" + userString + "' já está inserido, tente novamente.");
                i--;
            } else {
                Jogos.add(userString);
                System.out.println("'" + userString + "' Inserido na lista!");
            }
        }
    }

    public static void Listar() {
        System.out.println("> Lista de Jogos <");

        for (int i = 0; i < Jogos.size(); i++) {
            System.out.print((i + 1) + "º - " + Jogos.get(i) + "\n");
        }
    }

    public static void AtualizarPorIndice() {
        System.out.println("> Revisando Lista de Jogos... <");

        Listar();

        System.out.print("> Qual jogo da lista Deseja atualizar: ");
        int userIntAtualizar = leia.nextInt();
        leia.nextLine(); // Limpar buffer
        userIntAtualizar--;

        System.out.print("> Novo Jogo: ");
        String userStringAtualizar = leia.nextLine();
        Jogos.set(userIntAtualizar, userStringAtualizar);

        System.out.println("\n> Nova Lista de Jogos... <");

        Listar();

    }

    public static void AtualizarPorNome() {

        System.out.println("> Revisando Lista de Jogos... <");

        Listar();

        System.out.print("> Qual jogo da lista Deseja atualizar? Insira por escrito: ");
        String userStringAtualizar = leia.nextLine();

        boolean jogoEncontrado = false;

        for (int i = 0; i < Jogos.size(); i++) {

            if (Jogos.get(i).equalsIgnoreCase(userStringAtualizar)) {// Se o item do array for igual a palavra
                System.out.println("'" + userStringAtualizar + "' está na lista!");
                System.out.println("Por qual jogo deseja substituir? Insira por escrito: ");
                String userStringSubsJogo = leia.nextLine();
                System.out.println("'" + Jogos.get(i) + "' será substituído por '" + userStringSubsJogo + "'");

                Jogos.set(i, userStringSubsJogo);
                jogoEncontrado = true;

                break;
                // Encerra ao achar a palavra identica e substituir.
            }
        }

        if (!jogoEncontrado) { // Se depois de procurar em tudo não achar, sinaliza
            System.out.println("Este jogo não existe, verifique a digitação.");
        }
    }

    /*
     * Na hora de atualizar a pessoa insere o número do indice e isso decrementado
     * leva a posição correta do array para modificar OU remover.
     * 
     * 
     * Mas agora preciso que o mesmo sistema solicite resposta, receba a String (Tem
     * como ignrando maiuscula e minuscula?), procure pelo array uma string identica
     * e retorne com a possibilidade de troca ou remoção....
     */

    public static void RemoverPorIndice() {
        System.out.println("> Revisando Lista de Jogos... <");

        Listar();

        System.out.print("> Qual Jogo da Lista Deseja Remover: ");
        int userIntRemover = leia.nextInt();
        userIntRemover--;

        Jogos.remove(userIntRemover);

        System.out.println("\n> Nova Lista de Jogos... <");
        Listar();
    }

    public static void RemoverPorNome() {

        System.out.println("> Revisando Lista de Jogos... <");

        Listar();

        System.out.print("> Qual jogo da lista Deseja Remover? Insira por escrito: ");
        String userStringRemover = leia.nextLine();

        boolean jogoEncontrado = false;

        for (int i = 0; i < Jogos.size(); i++) {

            if (Jogos.get(i).equalsIgnoreCase(userStringRemover)) {// Se o item do array for igual a palavra
                System.out.println("'" + userStringRemover + "' está na lista!");
                System.out.println("'" + Jogos.get(i) + "' será Removido");

                Jogos.remove(i);
                jogoEncontrado = true;

                break;
                // Encerra ao achar a palavra identica e remover.
            }
        }

        if (!jogoEncontrado) { // Se depois de procurar em tudo não achar, sinaliza
            System.out.println("Este jogo não existe, verifique a digitação.");
        }
    }

    public static void Sair() {
        System.out.println("Saindo...");
        Trava = false;
    }

}