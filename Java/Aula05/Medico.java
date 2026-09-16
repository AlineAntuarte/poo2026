package Java.Aula05;

public class Medico {
    private String cpf;
    private String nome;
    private String crea;
    private float salarioBruto;

    public Medico(String cpf, String nome, String crea, float salarioBruto) {
        this.cpf = cpf;
        this.nome = nome;
        this.crea = crea;
        this.salarioBruto = salarioBruto;
    }

    double calcularSalarioLiquido(double desconto, double bonus) {
        return salarioBruto - (salarioBruto * desconto) + bonus;
    }

    public void emitirexame() {
        System.out.println("Emitindo exame...");
    }
}