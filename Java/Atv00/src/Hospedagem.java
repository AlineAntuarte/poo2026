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
    double valorDiaria;
    double baseDiaria = 100;
    double baseCafeDaManha = 30;

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

    public double valorDiaria() {
        valorDiaria = this.diasDeHospedagem * baseDiaria;
        if (this.cafeDaManha) {
            valorDiaria += (this.diasDeHospedagem * baseCafeDaManha);
        }
        return valorDiaria;
    }

    // Preencher Objetos

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // Criando ArrayList
        ArrayList<Hospedagem> listaDeHospedagens = new ArrayList<>();

        // Preencher o Array com Loop

        System.out.print("Quantos estudantes iram se hospedar: ");
        int numEstudantes = leia.nextInt();
        leia.nextLine();

        String[] nomeProntos = { "Aline", "Ana", "Rebeca", "Gabriel", "Helena", "Sofia",
                "Lucas", "Matheus", "Eduardo",
                "José" };
        String[] emailProntos = { "Aline@gmail.com", "Ana@gmail.com", "Rebeca@gmail.com",
                "Gabriel@gmail.com",
                "Helena@gmail.com", "Sofia@gmail.com", "Lucas@gmail.com",
                "Matheus@gmail.com", "Eduardo@gmail.com",
                "José@gmail.com" };
        int[] numQuartoProntos = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] diasDeHospedagemProntos = { 1, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        boolean[] cafeDaManhaProntos = { true, false, true, true, false, false, true, false,
                true, false };

        for (int i = 0; i < numEstudantes; i++) {
            // Preenchendo o as variáveis com informações
            String nome = nomeProntos[i];
            String email = emailProntos[i];
            int numQuarto = numQuartoProntos[i];
            int diasDeHospedagem = diasDeHospedagemProntos[i];
            boolean cafeDaManha = cafeDaManhaProntos[i];

            listaDeHospedagens.add(new Hospedagem(nome, email, numQuarto, diasDeHospedagem, cafeDaManha));

            System.out.print("\n");
        }

        for (Hospedagem D : listaDeHospedagens) {

            System.out.println("Nome: " + D.nome);
            System.out.println("Email: " + D.email);
            System.out.println("Número de Quarto: " + D.numQuarto);
            System.out.println("Dias de Hospedagem: " + D.diasDeHospedagem);

            if (D.temCafeh()) {
                System.out.print("'" + D.nome + "' solicitou café da manhã incluso.");
            } else {
                System.out.print("'" + D.nome + "' não solicitou café da manhã incluso.");
            }

            System.out.print("\nValor Base da Diária: R$100,00");
            System.out.print("\nValor Base do Café: R$30,00");
            System.out.printf("\nTotal a pagar: R$ %.2f\n", D.valorDiaria());
            System.out.println("\n----------------------------------------------");
        }
        leia.close();
    }
}