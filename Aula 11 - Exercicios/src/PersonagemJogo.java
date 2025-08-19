public class PersonagemJogo {

    private String nome;
    private int nivel;
    private int pontosDeVida;


    //METODO CONSTRUTOR
    public PersonagemJogo(String nome, int nivel, int pontosDeVida) {

        this.nome = nome;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
    }


    //GET E SET


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }


    //METODOS

    public void receberDano(int dano) {

        pontosDeVida -= dano;
    }

    public void subirDeNivel() {

        nivel = nivel + 1;
    }


    public void exibirStatus() {

        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Ponto de Vida: " + pontosDeVida);
    }
}
