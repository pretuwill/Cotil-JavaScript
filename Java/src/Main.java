public class Main {
    public static void main(String[] args) {
        /*
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
 */
        // Criando um objeto do tipo Item e testando seus métodos
        Item item = new Item("001", "Teclado", 25, 55.0);
        System.out.println("Código do item: " + item.getCodigo());
        System.out.println("Descrição do item: " + item.getDescricao());
        System.out.println("Quantidade comprada do item: " + item.getQuantidade());
        System.out.println("Preço do item: R$" + item.getPreco());
        System.out.println("Total a pagar: R$" + item.getTotal());

    }
}
