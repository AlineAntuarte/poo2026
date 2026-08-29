package Java.Atv00.src;

import java.util.Scanner;
import java.util.ArrayList;

public class Hospedagem {
    // Atributos
    String nome;
    String email;
    int numQuarto;
    int diasDeHospedagem;
    boolean cafeDaManha;

    // Construtor
    public Hospedagem(String nome, String email, int numQuarto, int diasDeHospedagem, boolean cafeDaManha) {
        this.nome = nome;
        this.email = email;
        this.numQuarto = numQuarto;
        this.diasDeHospedagem = diasDeHospedagem;
        this.cafeDaManha = cafeDaManha;
    }
    // Tem Café da Manhã Incluso?
    // Verficar 'boolean cadeDaManha' de todas as hospedagens para ver se é true ou
    // false

    public boolean temCafeh() {
        if (cafeDaManha) {
            return true;
        } else {
            return false;
        }
    }

    // Preencher Objetos

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // Criando ArrayList
        ArrayList<Hospedagem> listaDeHospedagens = new ArrayList<>();

        // Preencher o Array com Loop

        /*
         * String[] nome = { "Aline", "Ana", "Rebeca", "Gabriel", "Helena", "Sofia",
         * "Lucas", "Matheus", "Eduardo",
         * "José" };
         * String[] email = { "Aline@gmail.com", "Ana@gmail.com", "Rebeca@gmail.com",
         * "Gabriel@gmail.com",
         * "Helena@gmail.com", "Sofia@gmail.com", "Lucas@gmail.com",
         * "Matheus@gmail.com", "Eduardo@gmail.com",
         * "José@gmail.com" };
         * int[] numQuarto = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
         * int[] diasDeHospedagem = { 1, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
         * boolean[] cafeDaManha = { true, false, true, true, false, false, true, false,
         * true, false };
         */

        for (int i = 0; i < 5; i++) {
            // Preenchendo o as variáveis com informações

            System.out.println("----------------------------------");
            System.out.print("Nome: ");
            String nome = leia.nextLine();

            System.out.print("Email: ");
            String email = leia.nextLine();

            System.out.print("Número do Quarto: ");
            int numQuarto = leia.nextInt();

            System.out.print("Dias Hospedado: ");
            int diasDeHospedagem = leia.nextInt();

            System.out.print("Café da manhã incluso: ");
            boolean cafeDaManha = leia.nextBoolean();
            leia.nextLine();

            listaDeHospedagens.add(new Hospedagem(nome, email, numQuarto, diasDeHospedagem, cafeDaManha));

            System.out.print("\n");

        }

        for (Hospedagem D : listaDeHospedagens) {

            System.out.println("Nome: ");
            System.out.println("Email: ");
            System.out.println("Número de Quarto: ");
            System.out.println("Dias de Hospedagem: ");

            if (D.temCafeh()) {
                System.out.println(D.nome + "' solicitou café da mnhã incluso.");
            } else {
                System.out.println(D.nome + "' não solicitou café da mnhã incluso.");
            }
        }
        leia.close();
    }
}