public class Main {
    public static void main(String[] args) {

        //Exercicio 1  Criando a Classe Musica (Apenas Atributos)

        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Bohemian Rhapsody";
        minhaMusica.artista = "Queen";
        minhaMusica.duracaoEmSegundos = 355;

        System.out.println("Tocando agora: " + minhaMusica.titulo);
        System.out.println("Artista: " + minhaMusica.artista);


        //Exercicio 2  Criando a Classe Carro com um Método Simples

        Carro meuCarro = new Carro();

        meuCarro.marca = "Ford";
        meuCarro.modelo = "Mustang";
        meuCarro.ano = 1969;
        meuCarro.exibirInformacoes();


        //Exercicio 3  Criando a Classe Aluno com Lógica Simples

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Carlos";
        aluno1.nota = 8.5;
        aluno1.verificarStatus();

        Aluno aluno2 = new Aluno();

        aluno2.nome = "Ana";
        aluno2.nota = 6.0;
        aluno2.verificarStatus();


        //Exercicio 4  Gerenciando uma ContaBancaria




    }
}