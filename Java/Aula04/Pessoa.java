package Java.Aula04;

import java.util.Scanner;
import java.util.ArrayList;

// Criar Pessoa
public class Pessoa {
    // Class
    // Dentro da Class colocamos os atributos de uma Pessoa:
    String nome;
    double altura;
    int idade;
    double peso;

    // Não preenchemos os valores aqui, definimos o tipo e nome da variável.
    // O objeto que criaremos na memória recebe os valores.

    // Construtor
    public Pessoa(String nome, double altura, int idade, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;
    }

    // Métodos = Ações
    public boolean ehMaiorDeIdade() {
        // Maioridade
        if (this.idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // Métodos = Ações
    public double IMC() {
        return this.peso / (Math.pow(this.altura, 2));
    }

    public static void main(String[] args) {
        // MAIN - M - A - I - N - MAIN
        Scanner leia = new Scanner(System.in);

        // 1. Criar o ArrayList de objetos do tipo 'Pessoa'
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        // 2. Adicionar objetos à lista

        for (int i = 0; i < 4; i++) {
            System.out.println("----------------------------------");
            System.out.print("Insira o " + (i + 1) + "° Nome: ");
            String userNome = leia.nextLine();

            System.out.print("Insira a " + (i + 1) + "° Altura (Metros): ");
            double userAltura = leia.nextDouble();

            System.out.print("Insira a " + (i + 1) + "° Idade: ");
            int userIdade = leia.nextInt();

            System.out.print("Insira o " + (i + 1) + "° Peso (Kg): ");
            double userPeso = leia.nextDouble();
            leia.nextLine();

            System.out.print("\n");

            listaDePessoas.add(new Pessoa(userNome, userAltura, userIdade, userPeso));
        }

        for (Pessoa p : listaDePessoas) {
            if (p.ehMaiorDeIdade()) {
                System.out.println("A pessoa '" + p.nome + "' é maior de Idade. Sua idade é: " + p.idade);
            } else {
                System.out.println("A pessoa '" + p.nome + "' não é maior de Idade. Sua idade é: " + p.idade);

            }
            System.out.println("O IMC de '" + p.nome + "' é: " + String.format("%.2f", p.IMC()));
            System.out.print("\n");
        }

        leia.close();
    }

}

/*
 * Exercício
 * 
 * Criar uma classe "Pessoa" com os
 * seguintes atributos: Nome; Altura; Idade e Peso.
 * 
 * A classe também necessita dos seguintes comportamentos:
 * calcularIMC - Calculo: peso / (altura²)
 * ehMaiorDeIdade
 * 
 * Monte um sistema iterativo para cadastrar quatro pessoas em uma lista
 * Mostre quem é maior de idade e seu IMC.
 */