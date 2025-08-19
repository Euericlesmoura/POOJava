//CLASSE
public class Gerente extends Funcionario {
    private String departamento;



    //CONSTRUTOR
    public Gerente (String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }



    //GET
    public String getDepartamento() {
        return departamento;
    }

}
