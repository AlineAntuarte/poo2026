## Arquitetura de Projetos Java: Múltiplos Arquivos e Pacotes

O ecossistema Java foi desenhado para a construção de sistemas escaláveis e colaborativos, o que torna a separação do código em múltiplos arquivos uma exigência técnica assim que o projeto começa a crescer ou passa a ser versionado em plataformas como o GitHub.

* **A Regra da Classe Pública:** Cada arquivo `.java` só pode conter **uma única classe pública** (`public class`). O nome do arquivo tem de ser rigorosamente idêntico ao nome dessa classe (respeitando as letras maiúsculas e minúsculas).
* **Organização em Pacotes (Packages):** Em projetos bem estruturados, os arquivos são divididos em diretórios que representam o seu contexto lógico (por exemplo, separar as classes de interface gráfica das classes de regras de negócio). No topo do código, a declaração `package br.edu.ifsc.ads;` indica exatamente em qual pasta física aquela classe reside.
* **O Mecanismo de `import`:** Se duas classes (ex: o teu `Principal.java` e `Aluno.java`) estiverem na mesma pasta/pacote, elas reconhecem-se instantaneamente. No entanto, se o teu `Principal` precisar de usar uma classe de outro pacote, deves declarar explicitamente `import nome.do.outro.pacote.Aluno;` logo abaixo da declaração do pacote.
* **O Ponto de Entrada (Entry Point):** Não importa se tens dezenas de arquivos, a Máquina Virtual Java (JVM) só vai arrancar a execução quando encontrar a assinatura exata `public static void main(String[] args)`. Todos os outros arquivos servem como peças ou bibliotecas que serão invocadas a partir desta linha de partida.

---

## Fundamentos Profundos da Orientação a Objetos (POO)

A POO resolve problemas complexos modelando o código com base em entidades do mundo real, protegendo os seus dados e definindo exatamente como interagem entre si.

### 1. Classes vs. Objetos (Abstração e Instanciação)

* **Classe (A Planta Baixa):** É a estrutura teórica e a tipagem. A classe não ocupa espaço na memória com dados reais, serve apenas para definir o contrato. Se criares uma classe `ComponentePC`, defines estruturalmente que qualquer componente precisará de uma `String modelo` e um `double preco`.
* **Objeto (A Instância):** É a concretização física na memória RAM durante a execução. Utilizando a palavra reservada `new`, crias a entidade viva. A partir daquela classe única `ComponentePC`, podes instanciar objetos distintos e reais, como um `processadorIntel` e um `ssdPNY`.

### 2. Construtores e Sobrecarga (Overloading)

* **O Método Construtor:** É o bloco de código disparado imediatamente no momento do `new`. Ele força o objeto a nascer num estado válido. Ao contrário dos métodos normais, não tem tipo de retorno (nem mesmo `void`).
* **Sobrecarga (Overloading):** Uma classe pode ter vários construtores, proporcionando flexibilidade. Podes ter um construtor que recebe apenas o `modelo` e preenche o preço padrão com 0.0, e um segundo construtor que exige o `modelo` e o `preco` em simultâneo. A escolha de qual construtor será executado é feita automaticamente pelo Java com base nos parâmetros que forneceres no parêntesis do `new`.

### 3. A Palavra-chave `this`

* **Resolução de Conflitos (Shadowing):** Quando o teu método construtor ou *setter* recebe um parâmetro de entrada com o exato mesmo nome de um atributo da classe (ex: ambos chamam-se `preco`), o Java prioriza a variável mais próxima (o parâmetro). Utilizas `this.preco` para apontar inequivocamente para a variável da classe, permitindo executar a instrução `this.preco = preco;` para salvar a informação definitivamente.
* **Encadeamento de Construtores:** O comando `this()` (com parêntesis) pode ser invocado na primeira linha de um construtor para chamar outro construtor da mesma classe, reaproveitando as lógicas de inicialização e evitando duplicação de código.

### 4. Encapsulamento (Proteção de Estado)

O estado de um objeto nunca deve ser adulterado diretamente por elementos externos. O encapsulamento é o mecanismo de segurança da classe.

* **Ocultação dos Dados:** O primeiro passo é marcar os atributos estruturais como `private`. Isso bloqueia o acesso externo, impedindo operações desastrosas como `conta.saldo = -100;` a partir do `main`.
* **Métodos Getters e Setters:** Crias métodos `public` para interagir com esses dados. O verdadeiro valor do encapsulamento está na validação. Um método `public void setFrequenciaMonitor(int frequencia)` pode conter um bloco `if` que recusa a gravação caso o valor seja menor que 60hz, garantindo a integridade do sistema.

### 5. O Método `toString()` e a Raiz Universal

* **A Origem em `Object`:** Na linguagem Java, existe uma hierarquia onde todas as classes que criares herdarão automaticamente os comportamentos da superclasse `java.lang.Object`. Um desses comportamentos é o método `toString()`.
* **Sobrescrita (`@Override`):** Se tentares imprimir o teu objeto diretamente com `System.out.println(meuComponente);` sem preparares a classe, o Java usará o `toString()` padrão e imprimirá um endereço de memória enigmático (ex: `ComponentePC@3fee733d`). Ao adicionares a anotação `@Override` e reescreveres este método na tua classe devolvendo uma `String` detalhada, ensinas a JVM a mostrar exatamente o que desejas (ex: `"Modelo: Intel i5 | Preço: R$ 800"`).

---

## Estruturas de Controle de Fluxo e Iteração

As estruturas de controle governam o fluxo de execução, quebrando a linearidade de cima para baixo do código-fonte.

### Condicionais (Bifurcações e Escolhas Lógicas)

* **`if / else if / else`:** A espinha dorsal das decisões condicionais. Baseia-se exclusivamente em expressões booleanas (verdadeiro ou falso). Permite a construção de regras complexas utilizando operadores lógicos como `&&` (E) e `||` (OU). O encadeamento de `else if` pára de processar imediatamente assim que o primeiro bloco verdadeiro for encontrado.
* **`switch-case`:** A estrutura otimizada para rotas precisas baseadas numa única variável. Ideal para verificar seleções de menus, códigos de erro exatos ou Strings pré-definidas. No Java moderno (a partir da versão 14), é possível usar o *Switch Expressions* com a sintaxe de seta `->`, que simplifica a leitura e elimina a necessidade de colocar o comando `break;` no final de cada caso para evitar que ele execute os de baixo.

### Repetições (Loops, Iteradores e Coleções)

* **`while` (Condição Pré-testada):** Avalia a condição booleana no topo do bloco. Se for falsa desde o início, o código interno não roda nenhuma vez. É a ferramenta certa quando não sabes quantas repetições vão ocorrer, como num sistema de pagamento que precisa de continuar a aguardar o retorno da confirmação de um Pix.
* **`do-while` (Condição Pós-testada):** A estrutura inverte o fluxo do `while`. Ela processa todo o bloco de código primeiro e verifica a condição de repetição apenas no final. Isto garante de forma absoluta que o código seja executado **pelo menos uma vez**. Muito usado para forçar a impressão da tela de um menu interativo antes de ler a resposta.
* **`for` (Laço Estruturado):** Condensa o controle de contagem numa linha só, aglomerando a inicialização do contador (`int i = 0`), o limite (`i < 10`) e a taxa de avanço (`i++`). Perfeito para algoritmos matemáticos ou saltos programados numa matriz.
* **`for-each` (Laço Aprimorado):** Uma sintaxe simplificada do laço for (ex: `for (String disciplina : listaMaterias)`), introduzida especificamente para varrer listas completas, *arrays* ou coleções do início ao fim de forma segura. Remove a responsabilidade de gerir o índice numérico (`i`), evitando o clássico erro de estourar os limites da memória (*IndexOutOfBoundsException*).
