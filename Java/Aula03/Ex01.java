package Java.Aula03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Jogo da Forca
public class Ex01 {

    // Aqui teremos a vasta lista de palavras para advinhar
    static String[] listaDePalavras = { "Pitaya" };
    // Este array no momento será testado com apenas uma palavra
    static List<String> palavraOculta = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("== Jogo da Forca ==");
        Scanner leia = new Scanner(System.in);

        int tentativas = 5;

        boolean Trava = true;

        // Cadeia de letras da palavra da vez
        char[] letras = listaDePalavras[0].toCharArray();

        for (int i = 0; i < listaDePalavras[0].length(); i++) {
            // Sabendo a quantidade de letras, sem posição, posso fazer a Palavra oculta no
            // terminal com Underline
            palavraOculta.add("_");
        }

        while (Trava) {
            boolean acertou = false;

            printPalavra();

            System.out.print("\n\nInsira uma Letra: ");
            String userStringLetra = leia.nextLine();

            // Varrer a palavra original e substituir no indice indicado
            for (int i = 0; i < listaDePalavras[0].length(); i++) {
                if (userStringLetra.equalsIgnoreCase(String.valueOf(letras[i]))) {
                    palavraOculta.set(i, userStringLetra);
                    acertou = true;
                }
            }

            if (acertou) {
                // System.out.println("Acertou alguma coisa");
                acertou = false;
            } else {
                tentativas--;
                System.out.println("Você errou.\nTentativas Restantes: " + tentativas);
                // System.out.println("Não achou letra alguma");
            }

            System.out.println("\n");
            if (!palavraOculta.contains("_")) {
                Trava = false;
                printPalavra();
                // Nenhuma letra oculta, jogo ENCERRA.
            } else if (tentativas == 0) {
                // Chances acabam, jogo encerra.
                System.out.println("Suas chances chegaram a 0.\nEncerrando...");
                Trava = false;
            }
            System.out.println("\n");

        }

        leia.close();
    }

    public static void printPalavra() {
        for (int i = 0; i < listaDePalavras[0].length(); i++) {
            System.out.print(palavraOculta.get(i));
        }
    }
}