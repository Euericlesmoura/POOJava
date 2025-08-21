package exercicio3;

public class Tarefa implements Concluivel {

    protected String descricao;
    protected boolean concluida;
    protected int prioridade;


    //CONSTRUTOR

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
    }



    //GET E SET

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isConcluida() {
        return concluida;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }



    //METODO

    @Override
    public void concluir() {

    }

    @Override
    public boolean estaConcluida() {
        return false;
    }

    @Override
    public void exbirStatus() {

    }

    @Override
    public void exbirStatus(boolean concluida) {

        concluida = false;

        if (concluida = true) {
            System.out.println("Tarefa OK !");
        }
        else {
            System.out.printf("Pendente");
        }


    }



}
