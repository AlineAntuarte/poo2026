package Java.Aula05.Exercício;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        leia.close();
    }
}

/*
 * Exercício
 * 
 * Crie uma classe pai chamada Personagem com: nome, nivel, vida e força.
 * ** Métodos
 * atacar() --> imprime uma mensagem genérica de ataque.
 * receberDano(int dano) --> reduz a vida do personagem conforme o dano
 * recebido.
 * **Crie classes filhas que herdam de Personagem:
 * Mago com atributo mana e método lancarMagia() --> imprime uma mensagem de
 * feitiço.
 * Guerreiro com atributo armadura (int) e método golpeEspecial() -->
 * imprime uma mensagem de ataque poderoso.
 * Arqueiro com atributo precisao (int) e qtdFlechas e o método atirarFlecha()
 * --> imprime uma mensagem de disparo de flecha.
 * 
 * No método main, crie um objeto de cada classe filha e demonstre:
 * 
 * Uso dos atributos herdados.
 * Chamadas aos métodos da classe pai.
 * Chamadas aos métodos específicos de cada classe filha.
 */