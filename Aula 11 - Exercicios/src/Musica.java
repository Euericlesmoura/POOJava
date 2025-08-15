public class Musica {

    public String titulo;
    public String artista;
    public int duracaoEmSegundos;

    public Musica(String titulo, String artista, int duracaoEmSegundos) {

        this.titulo = titulo;
        this.artista = artista;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public void exibirFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duraçao: " + duracaoEmSegundos + "seg");
    }

}
