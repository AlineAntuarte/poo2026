package Java.Aula05;

import java.util.Scanner;
import java.util.ArrayList;

public class Engenheiro {
    private String cpf;
    private String nome;
    private String crea;
    private float salarioBruto;

    public Engenheiro(String cpf, String nome, String crea, float salarioBruto) {
        this.cpf = cpf;
        this.nome = nome;
        this.crea = crea;
        this.salarioBruto = salarioBruto;
    }

    double calcularSalarioLiquido(double desconto, double bonus) {
        return salarioBruto - (salarioBruto * desconto) + bonus;
    }

    public void emitirLaudo() {
        System.out.println("Emitindo laudo...");
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        leia.close();
    }
}