import java.security.PublicKey;

public class Produto {

    //ATRIBUTOS
    private String nome;
    private double preco;
    private int estoque;

    //METODO CONSTRUTOR
    public Produto(String nome, double preco, int estoque) {

        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    //GET E SET
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double novoPreco) {

        if (novoPreco > 0) {
            preco += novoPreco;
        }
        else {
            System.out.println("Erro: O preço deve ser um valor positivo.");
        }

    }

    public void adicionarEstoque(int quantidade) {

        estoque += quantidade;
    }

    public void realizarVenda(int quantidade) {

        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {

            estoque = estoque - quantidade;
            System.out.println("Venda realizada !");
        }
    }


}
