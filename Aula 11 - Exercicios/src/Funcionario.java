//CLASSE
public class Funcionario {
    protected String nome;
    protected double salario;



    //CONSTRUTOR
    public Funcionario (String nome, double salario) {

        this.nome = nome;
        this.salario = salario;
    }



    //GET
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }



}
