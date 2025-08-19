//Criando uma Classe -> public class NOME {}
public class Produto {

    //1- Criando um Atributo -> public TIPO NOME;
    //Atributos sao as informacoes/caracteristicas do objeto da classe
    //Tipos de Atributos ->  public, private, protected  (ENCAPSULAMENTO)
    //HERANCA ->  reutiliza código, a classe herda os atributos de outra classe
    // public class CLASSE QUE RECEBE extends CLASSE QUE DOA ATRIBUTOS
    //ENCAPSULAMENTO (protected) -> usado em heranca, torna os atributos acessiveis a classe e aos filhos
    //ABSTRAÇAO

    private String nome;
    private  double tamanho;
    private double preco;
    private String cor;
    private int unidade;
    private String marca;


    //GET E SET ->
    //GET é pegar, ver a informaçao
    public String getNome() {
        return nome;
    }

    //SET é definir ou mudar a informaçao
    public void setNome(String nome) {
        this.nome = nome;
    }


    //METODO CONSTRUTOR
    public Produto(String nome, double preco, String marca, double tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.tamanho = tamanho;
    }


    //2- Criando um Método
    //Mostrar informaçoes

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }
}
