package Java.Aula03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Jogo da Forca
public class Ex01 {

    // Aqui teremos a vasta lista de palavras para advinhar
    static String[] listaDePalavras = { "Bola" };
    // Palavra da lista, porém oculta, recebe uma palavra por vez em forma Ide _
    static List<String> palavraOculta = new ArrayList<>();
    // Cadeia de letras feita pela palavra da vez
    static char[] letras = listaDePalavras[0].toCharArray();
    // Variável para mostrar a palara completa no final
    static String palavraReveladaString = listaDePalavras[0];
    // Chances de errar
    static int tentativas = 5;
    // Trava do loop que mantem o jogo rodando
    static boolean Trava = true;
    // Trava para determinar um acerto no chute de letra
    static boolean acertou = false;
    // Leitor de letras do usuário
    static String userStringLetra = "";

    public static void main(String[] args) {
        System.out.println("== Jogo da Forca ==\n");
        Scanner leia = new Scanner(System.in);

        formacaoPalavraOculta();
        // Sabendo a quantidade de letras, sem posição, posso fazer a Palavra oculta no
        // terminal com Underline

        while (Trava) {
            acertou = false;
            desenharForcaInicial();
            desenharForca();
            printPalavra();

            System.out.print("\n\nInsira uma Letra: ");
            userStringLetra = leia.nextLine();

            // Varrer a palavra original e substituir no indice indicado
            atualizarPalavraOculta();

            // Consequências de errar ou acertar
            errouOuAcertou();
            System.out.println("--------------------------------------------");
            verificarFimDeJogo();
        }

        leia.close();
    }

    public static void formacaoPalavraOculta() {
        for (int i = 0; i < listaDePalavras[0].length(); i++) {
            palavraOculta.add("_");
        }
    }

    public static void printPalavra() {
        for (int i = 0; i < listaDePalavras[0].length(); i++) {
            System.out.print(palavraOculta.get(i));
        }
    }

    public static void atualizarPalavraOculta() {
        for (int i = 0; i < listaDePalavras[0].length(); i++) {
            if (userStringLetra.equalsIgnoreCase(String.valueOf(letras[i]))) {
                palavraOculta.set(i, String.valueOf(letras[i]));
                // Substituindo 'userStringLetra' por 'String.valueOf(letras[i])'
                // Eu garanto que em locais com letra especificamente
                // maiúscula ou minúscula ela se mantenha fiel ao original.
                acertou = true;
            } else if (userStringLetra.isEmpty()) {
                System.out.println("Inserção vazia, digite uma letra!");
                continue; //
            }
        }
    }

    public static void errouOuAcertou() {
        if (acertou) {
            // System.out.println("Acertou alguma coisa");
            acertou = false;
        } else {
            tentativas--;
            System.out.println("Você errou.\nTentativas Restantes: " + tentativas);
            // System.out.println("Não achou letra alguma");
        }
    }

    public static void verificarFimDeJogo() {
        if (!palavraOculta.contains("_")) {
            Trava = false;
            // Nenhuma letra oculta, jogo ENCERRA.
            System.out.println("PARABÉNS! Você venceu, a palavra era: " + palavraReveladaString);
            System.out.println("\n");
        } else if (tentativas == 0) {
            // Chances acabam, jogo encerra.
            desenharForcaFinal();
            System.out.print("Suas chances chegaram a 0.\nEncerrando...");
            Trava = false;
        }
    }

    public static void desenharForca() {
        if (tentativas == 4) {
            // Forca com Corda 4
            System.out.println("""
                      +---+
                      |   |
                          |
                          |
                          |
                          |
                    =========
                    """);
            System.out.println("Forca com Corda");
        } else if (tentativas == 3) {
            // Forca com Cabeça 3
            System.out.println("""
                      +---+
                      |   |
                      O   |
                          |
                          |
                          |
                    =========
                    """);
            System.out.println("Forca com Cabeça");
        } else if (tentativas == 2) {
            // Forca com corpo 2
            System.out.println("""
                      +---+
                      |   |
                      O   |
                     /|\\  |
                          |
                          |
                    =========
                    """);
            System.out.println("Forca com corpo");
        } else if (tentativas == 1) {
            // Forca com pés 1
            System.out.println("""
                      +---+
                      |   |
                      O   |
                     /|\\  |
                     / \\  |
                          |
                    =========
                    """);
            System.out.println("Forca com pés");
        }
    }

    public static void desenharForcaInicial() {
        if (tentativas == 5) {
            // Forca Limpa 5
            System.out.println("""
                      +---+
                          |
                          |
                          |
                          |
                          |
                    =========
                    """);
            System.out.println("Forca Limpa");
        }
    }

    public static void desenharForcaFinal() {
        if (tentativas == 0) {
            // Enforcado 0
            System.out.println("""
                      +---+
                      |   |
                      X   |
                     /|\\  |
                     / \\  |
                          |
                    =========
                    """);
            System.out.println("Enforcado (×_×)");
        }
    }
}