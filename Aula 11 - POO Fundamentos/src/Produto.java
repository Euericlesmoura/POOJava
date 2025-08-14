//Criando uma Classe -> public class NOME {}
public class Produto {

    //1- Criando um Atributo -> public TIPO NOME;

    public String nome;
    public  double tamanho;
    public double preco;
    public String cor;
    public int unidade;
    public String marca;


    //2- Criando um Método

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }
}
