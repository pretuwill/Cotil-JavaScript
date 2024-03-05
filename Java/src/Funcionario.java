public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor que inicializa os atributos com valores vazios e zeros
    public Funcionario() {
        this.nome = "";
        this.sobrenome = "";
        this.salarioMensal = 0.0;
    }

    // Sobrecarga do construtor que recebe os atributos como argumentos
    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = (salarioMensal > 0) ? salarioMensal : 0.0; // Garante que o salário seja não negativo
    }

    // Métodos get e set para todos os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = (salarioMensal > 0) ? salarioMensal : 0.0; // Garante que o salário seja não negativo
    }

    // Método para calcular o salário anual
    public double salarioAnual() {
        return salarioMensal * 12;
    }

    // Método para aumentar o salário em um determinado percentual
    public void aumentarSalario(double percentual) {
        salarioMensal *= (1 + percentual / 100);
    }


}