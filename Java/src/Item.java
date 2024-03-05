public class Item {
    private String codigo;
    private String descricao;
    private int quantidade;
    private double preco;

    // Construtor que inicializa os quatro atributos
    public Item(String codigo, String descricao, int quantidade, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = (quantidade > 0) ? quantidade : 0; // Garante que a quantidade seja não negativa
        this.preco = (preco > 0) ? preco : 0.0; // Garante que o preço seja não negativo
    }

    // Métodos get e set para cada um dos atributos
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = (quantidade > 0) ? quantidade : 0; // Garante que a quantidade seja não negativa
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = (preco > 0) ? preco : 0.0; // Garante que o preço seja não negativo
    }

    // Método para calcular e retornar o total a pagar sobre o item faturado (quantidade * preco)
    public double getTotal() {
        return quantidade * preco;
    }


}