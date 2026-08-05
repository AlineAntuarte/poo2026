# Aula 01

* **Tarefa:**
  1. Monte a tabela do teste de mesa acompanhando os valores de `x` e `y` a cada iteração.
  2. Escreva o resultado exato impresso na tela (console).

---

## 🟢 Exercício 2: Manipulação de Strings e Entrada/Saída

**Enunciado:** Escreva um programa em Java utilizando a classe `Scanner` para:

1. Ler o nome completo do usuário.
2. Ler a idade do usuário.
3. Exibir no console:
   * O nome digitado em letras maiúsculas (`toUpperCase()`).
   * A quantidade de caracteres do nome (`length()`).
   * A idade informada.

---

## 🟢 Exercício 3: Estrutura Condicional Encadeada (Avaliação de Desempenho)

**Enunciado:** Escreva um programa que receba a nota de um aluno e exiba o desempenho correspondente segundo a tabela abaixo:

| Nota | Avaliação |
| :--- | :--- |
| **Menor que 5.0** | O aluno teve mau desempenho |
| **$\ge$ 5.0 e < 7.0** | O aluno teve desempenho regular |
| **$\ge$ 7.0 e < 9.0** | O aluno teve um bom desempenho |
| **Maior ou igual a 9.0** | O aluno teve um ótimo desempenho |

---

## 🟢 Exercício 4: Operações com Vetores (Arrays)

**Enunciado:** Crie um vetor de números inteiros de tamanho 5.

1. Atribua os valores `{10, 5, 8, 20, 3}` nas respectivas posições (0 a 4).
2. Utilize uma estrutura de repetição `for` para percorrer o vetor.
3. Imprima na tela o índice e o valor armazenado na seguinte formatação:
   `Posição [i]: [valor]`

---

## 🟢 Exercício 5: Interface Gráfica com `JOptionPane`

**Enunciado:** Desenvolva um programa em Java que utilize a biblioteca `javax.swing.JOptionPane` para:

1. Solicitar ao usuário o **Nome** (String).
2. Solicitar a **Idade** (convertendo o retorno de String para `int` com `Integer.parseInt`).
3. Solicitar a **Nota** (convertendo o retorno para `double` com `Double.parseDouble`).
4. Exibir uma caixa de mensagem (`showMessageDialog`) exibindo todos os dados formatados em linhas separadas.

---

## 🟢 Exercício 6: Janela Gráfica Personalizada com Formulário (`JPanel` + `JTextField`)

**Enunciado:** Monte uma janela interativa usando `JOptionPane.showConfirmDialog` contendo um formulário para cadastro de pessoa:

1. Crie três campos de texto (`JTextField`): Nome, Idade e E-mail.
2. Organize os rótulos e campos em um painel (`JPanel`) com `GridLayout(3, 2)`.
3. Ao clicar em **OK**, recupere os valores digitados, faça as conversões necessárias e exiba uma caixa de diálogo confirmando os dados cadastrados.

exercicios_aula_01.md
Exibindo exercicios_aula_01.md.
