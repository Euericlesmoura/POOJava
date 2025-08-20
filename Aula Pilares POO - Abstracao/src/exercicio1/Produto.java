package exercicio1;

public class Produto implements Exibivel {

    protected String nome;
    protected double preco;
    protected String categoria;


    public Produto (String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public void exibirDetalhes() {

        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Categoria: " + categoria);


    }
}
