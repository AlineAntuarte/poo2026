# Dicas

> Atenção: Ao ler um número (nextInt() ou nextDouble()) antes de um nextLine(), chame um leia.nextLine() extra para consumir a quebra de linha (\n) deixada no buffer.

## Como usar Scanner no Java?

### 1. Importar a classe

No topo do arquivo Java:

```java
import java.util.Scanner;
```

### 2. Criar o objeto Scanner

Dentro do seu método (ex: main), instancie apontando para a entrada padrão (System.in):

```java
Scanner leia = new Scanner(System.in);
```

### 3. Ler os dados e fechar

Use o método adequado para cada tipo de dado e feche o recurso no final:

```java
// Lendo texto (String)
System.out.print("Digite seu nome: ");
String nome = leia.nextLine();

// Lendo número inteiro (int)
System.out.print("Digite sua idade: ");
int idade = leia.nextInt();

// Lendo número decimal (double)
System.out.print("Digite sua altura: ");
double altura = leia.nextDouble();

// Boa prática: fechar o Scanner ao terminar
leia.close();
```

## Como usar o ArrayList?

### 1. Criar a lista

```java
ArrayList<String> jogos = new ArrayList<>();
```

### 2. Adicionar itens

```java
jogos.add("Zelda");
```

### 3. Ver o tamanho

```java
jogos.size();
```

### 4. Pegar um item

```java
jogos.get(0);
```
