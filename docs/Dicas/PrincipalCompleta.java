package docs.Dicas; // Define o pacote onde o código está inserido[cite: 146].

import java.util.Scanner; // Importa a classe Scanner para permitir a leitura de dados digitados pelo utilizador[cite: 147].

// 1. A SUPERCLASSE (O Molde Pai)
class Profissional { // Classe base que agrupa atributos e comportamentos comuns[cite: 146].

    protected String cpf; // Atributo protegido: visível apenas na classe pai e nas subclasses[cite: 146].
    protected String nome; // Nome do profissional[cite: 146].
    protected float salarioBruto; // Salário bruto base[cite: 146].

    public Profissional() { // Construtor Vazio (Exemplo de Sobrecarga de Construtor)[cite: 146].
        // Permite instanciar o objeto sem passar argumentos iniciais.
    } // Fim do construtor vazio.

    public Profissional(String cpf, String nome, float salarioBruto) { // Construtor Parametrizado[cite: 146].
        this.cpf = cpf; // Atribui o CPF recebido ao atributo da classe[cite: 146].
        this.nome = nome; // Atribui o nome[cite: 146].
        this.salarioBruto = salarioBruto; // Atribui o salário bruto[cite: 146].
    } // Fim do construtor parametrizado.

    // Método para cálculo com duas variáveis (desconto e bônus)[cite: 146].
    public double calcularSalarioLiquido(double desconto, double bonus) {
        return this.salarioBruto - (this.salarioBruto * desconto) + bonus; // Retorna o valor líquido calculado[cite:
                                                                           // 146].
    } // Fim do método.

    // POLIMORFISMO ESTÁTICO: SOBRECARGA (Overloading) - Mesmo nome do método acima,
    // mas recebe apenas 1 parâmetro[cite: 146].
    public double calcularSalarioLiquido(double desconto) {
        return this.salarioBruto - (this.salarioBruto * desconto); // Retorna o salário aplicando apenas o desconto, sem
                                                                   // bônus[cite: 146].
    } // Fim do método sobrecarregado.

    public String getNome() { // Getter para consultar o nome do profissional[cite: 146].
        return nome; // Devolve o conteúdo da variável nome[cite: 146].
    } // Fim do getter.

} // Fim da superclasse Profissional.

// 2. PRIMEIRA SUBCLASSE (Médico)
class Medico extends Profissional { // Herda de Profissional[cite: 144].

    private String crm; // Atributo exclusivo do Médico, protegido por encapsulamento[cite: 144].

    public Medico(String cpf, String nome, float salarioBruto, String crm) {
        super(cpf, nome, salarioBruto); // 'super' reutiliza o construtor da classe pai[cite: 144].
        this.crm = crm; // Inicializa o CRM específico do médico[cite: 144].
    } // Fim do construtor.

    public void solicitarExame() { // Comportamento exclusivo da classe Médico[cite: 144].
        System.out.println("Médico " + this.nome + " está solicitando um exame clínico com CRM: " + this.crm); // Imprime
                                                                                                               // a
                                                                                                               // ação[cite:
                                                                                                               // 144].
    } // Fim do método.

} // Fim da classe Medico.

// 3. SEGUNDA SUBCLASSE (Professor)
class Professor extends Profissional { // Herda de Profissional[cite: 145].

    private int horasTrabalhadas; // Atributo específico de controle de horas do professor[cite: 145].

    public Professor(String cpf, String nome, float salarioBruto, int horasTrabalhadas) {
        super(cpf, nome, salarioBruto); // Repassa os dados comuns para o construtor do pai[cite: 145].
        this.horasTrabalhadas = horasTrabalhadas; // Atribui as horas[cite: 145].
    } // Fim do construtor.

    // POLIMORFISMO DINÂMICO: SOBRESCRITA (Overriding)[cite: 145]
    @Override // Anotação de segurança que valida a sobrescrita do método do pai[cite: 145].
    public double calcularSalarioLiquido(double desconto, double bonus) {
        System.out.println("-> Usando o método de cálculo exclusivo do Professor!"); // Mensagem para comprovar a
                                                                                     // sobrescrita em tempo de
                                                                                     // execução[cite: 145].
        double salarioBaseCalculado = this.salarioBruto * this.horasTrabalhadas; // Regra de negócio própria baseada em
                                                                                 // horas[cite: 145].
        return salarioBaseCalculado - (salarioBaseCalculado * desconto) + bonus; // Retorna o valor final
                                                                                 // recalculado[cite: 145].
    } // Fim do método sobrescrito.

} // Fim da classe Professor.

// 4. CLASSE PRINCIPAL (Ponto de Partida e Testes)
public class PrincipalCompleta { // Classe executável principal contendo o método main[cite: 147].

    public static void main(String[] args) { // Assinatura obrigatória do ponto de entrada da JVM[cite: 147].

        Scanner leia = new Scanner(System.in); // Inicializa o objeto Scanner para ler entradas do teclado[cite: 147].

        // INTERAÇÃO COM O UTILIZADOR (Exemplo com Scanner)[cite: 147]
        System.out.println("Deseja instanciar um (M)édico ou um (P)rofessor?"); // Pergunta no console[cite: 147].
        char tipo = leia.nextLine().toUpperCase().charAt(0); // Lê a linha digitada, converte para maiúscula e pega o
                                                             // primeiro caractere[cite: 147].

        if (tipo == 'M') { // Condicional para verificar se a escolha foi Médico[cite: 147].
            Medico mDinamico = new Medico("111.222.333-44", "Doutora Ana", 12000.0f, "CRM-SC 9999"); // Cria objeto
                                                                                                     // Médico
                                                                                                     // dinamicamente[cite:
                                                                                                     // 147].
            System.out.println("Criado com sucesso! Médico: " + mDinamico.getNome()); // Confirmação[cite: 147].
        } else if (tipo == 'P') { // Condicional alternativa para Professor[cite: 147].
            Professor pDinamico = new Professor("555.666.777-88", "Professor Carlos", 50.0f, 40); // Cria objeto
                                                                                                  // Professor com base
                                                                                                  // em horas[cite:
                                                                                                  // 147].
            System.out.println("Criado com sucesso! Professor: " + pDinamico.getNome()); // Confirmação[cite: 147].
        } else { // Caso o utilizador digite uma opção inválida[cite: 147].
            System.out.println("Opção inválida."); // Mensagem de erro[cite: 147].
        } // Fim da estrutura condicional[cite: 147].

        System.out.println("\n--- DEMONSTRAÇÃO DE ARRAYS, POLIMORFISMO E CASTING ---"); // Separador estético[cite:
                                                                                        // 149].

        // CRIAÇÃO DE UM ARRAY POLIMÓRFICO[cite: 149]
        Profissional[] lista = new Profissional[2]; // Vetor do tipo genérico (Profissional) com capacidade para 2
                                                    // elementos[cite: 149].

        // UPCASTING IMPLÍCITO[cite: 149]
        lista[0] = new Medico("123456", "Rogério Médico", 15000.0f, "123456"); // Armazena um objeto Medico numa
                                                                               // referência do tipo Profissional[cite:
                                                                               // 149].
        lista[1] = new Professor("654321", "Maria Professora", 60.0f, 30); // Armazena um objeto Professor numa
                                                                           // referência do tipo Profissional[cite:
                                                                           // 149].

        // PERCORRENDO A LISTA COM FOR-EACH E POLIMORFISMO DINÂMICO[cite: 149]
        for (Profissional profi : lista) { // Varre o array elemento por elemento[cite: 149].

            System.out.println("\nColaborador: " + profi.getNome()); // Imprime o nome comum[cite: 149].

            // Polimorfismo dinâmico: o Java executa o 'calcularSalarioLiquido' específico
            // da classe real de cada objeto[cite: 150].
            double salarioFinal = profi.calcularSalarioLiquido(0.1, 500.0);
            System.out.println("Salário Líquido calculado: R$ " + salarioFinal); // Mostra o resultado[cite: 150].

            // VERIFICAÇÃO DE TIPO COM 'instanceof' E DOWNCASTING SEGURO[cite: 149]
            if (profi instanceof Medico) { // Pergunta se o objeto atual na memória é realmente um Medico[cite: 149].

                Medico med = (Medico) profi; // DOWNCASTING: Converte explicitamente a referência genérica de volta para
                                             // Medico[cite: 149].
                med.solicitarExame(); // Liberta o acesso ao método restrito exclusivo da classe Medico[cite: 149].

            } else if (profi instanceof Professor) { // Pergunta se o objeto atual é um Professor[cite: 149].

                Professor profCast = (Professor) profi; // Realiza o downcasting para Professor[cite: 149].
                System.out.println("Este professor possui carga horária cadastrada."); // Ação específica do
                                                                                       // professor[cite: 149].

            } // Fim das checagens condicionais de tipo[cite: 149].

        } // Fim do laço for-each[cite: 149].

        leia.close(); // Fecha o Scanner para liberar recursos do sistema operacional[cite: 147].

    } // Fim do método main[cite: 147].

} // Fim da classe PrincipalCompleta[cite: 147].