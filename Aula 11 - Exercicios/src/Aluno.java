public class Aluno {

    public String nome;
    public double nota;

    public Aluno(String nome, double nota) {

        this.nome = nome;
        this.nota = nota;
    }

    public void verificarStatus() {

        if (nota > 6) {
            System.out.println(nome + " foi APROVADO !");
        }
        else {
            System.out.println(nome + " foi REPROVADA !");
        }
    }
}
