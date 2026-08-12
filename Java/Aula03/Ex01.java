package Java.Aula03;

import java.util.Scanner;

// Jogo da Forca
public class Ex01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        boolean Trava = true;
        int tentativas = 5;

        String[] listaDePalavras = { "Antuarte" };
        String[] palavraOculta = {};

        int letras = listaDePalavras[0].length();

        for (int i = 0; i < letras; i++) {
            System.out.print("_");
            palavraOculta.add("_");
        }
        System.out.println("\n");

        leia.close();
    }
}