public class Main {
    public static void main(String[] args) {

        // Criando dois objetos do tipo Funcionario
        Funcionario funcionario1 = new Funcionario("João", "Silva", 3000);
        Funcionario funcionario2 = new Funcionario("Bruno","Bilatto",4000);

        // Exibindo o salário anual de cada funcionário
        System.out.println("Salário anual do funcionário 1: R$" + funcionario1.salarioAnual());
        System.out.println("Salário anual do funcionário 2: R$" + funcionario2.salarioAnual());

        // Dando um aumento de 10% para cada funcionário
        funcionario1.aumentarSalario(10);
        funcionario2.aumentarSalario(10);

        // Exibindo novamente o salário anual de cada funcionário após o aumento
        System.out.println("\nApós o aumento de 10%:");
        System.out.println("Salário anual do funcionário 1: R$" + funcionario1.salarioAnual());
        System.out.println("Salário anual do funcionário 2: R$" + funcionario2.salarioAnual());
    }
}