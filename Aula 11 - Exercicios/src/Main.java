import java.nio.ShortBuffer;

public class Main {
    public static void main(String[] args) {

        //Exercicio 1  Criando a Classe Musica (Apenas Atributos)

        Musica minhaMusica = new Musica("Bohemian Rhapsody", "Queen", 355);

        minhaMusica.exibirFichaTecnica();

        //Declarando as informaces manualmente
//        minhaMusica.titulo = "Bohemian Rhapsody";
//        minhaMusica.artista = "Queen";
//        minhaMusica.duracaoEmSegundos = 355;
//
//        System.out.println("Tocando agora: " + minhaMusica.titulo);
//        System.out.println("Artista: " + minhaMusica.artista);


        //Exercicio 2  Criando a Classe Carro com um Método Simples

        Carro meuCarro = new Carro("Ford","Fiesta", 2007);

        meuCarro.exibirInformacoes();

        //Declarando as informaces manualmente
//        meuCarro.marca = "Ford";
//        meuCarro.modelo = "Mustang";
//        meuCarro.ano = 1969;


        //Exercicio 3  Criando a Classe Aluno com Lógica Simples

        Aluno aluno1 = new Aluno("Carlos", 8.5);
        aluno1.verificarStatus();

        Aluno aluno2 = new Aluno("Ana", 6.0);
        aluno2.verificarStatus();


        //Declarando as informaces manualmente
//        aluno1.nome = "Carlos";
//        aluno1.nota = 8.5;
//        aluno1.verificarStatus();
//
//        aluno2.nome = "Ana";
//        aluno2.nota = 6.0;
//        aluno2.verificarStatus();


        //Exercicio 4  Gerenciando uma ContaBancaria

        ContaBancaria conta = new ContaBancaria("Juliana", 2000);



        conta.depositar(200);
        conta.sacar(500);

        conta.exibirDados();


        //Exercicio 5  Controlando o Estoque de um Produto

        Produto produto = new Produto("celular", 2000.00, 10);

        produto.adicionarEstoque(5);
        System.out.println("Estoque atual: " + produto.getEstoque());
        produto.realizarVenda(20);


        produto.realizarVenda(2);
        System.out.println("Estoque após venda: " + produto.getEstoque());


        produto.setPreco(-50);
        produto.setPreco(5000);
        System.out.println("Novo preço: " + produto.getPreco());


        //Exercicio 6  Criando um PersonagemJogo

        PersonagemJogo heroi = new PersonagemJogo("Aragon", 5, 100);

        heroi.exibirStatus();

        heroi.receberDano(30);
        heroi.subirDeNivel();

        System.out.println("Após a batalha:");
        heroi.exibirStatus();



        //LISTA 4 - EXERCICIO 1  Pessoa e Atleta

        Atleta jogador = new Atleta ("Cristiano Ronaldo" , "Futebol");
        System.out.println("Nome: " + jogador.getNome()); // Herdado
        System.out.println("Esporte: " + jogador.getEsporte()); // Próprio



        //LISTA 4 - EXERCICIO 2  Pessoa e Atleta

        Carro1 carro = new Carro1("Ford", 4);
        Bicicleta bicicleta = new Bicicleta("Caloi", 10);

        System.out.println("Carro: " + carro.getMarca() + " com " + carro.getNumeroDePortas() + " portas.");
        System.out.println("Bicicleta: " + bicicleta.getMarca() + " com " + bicicleta.getNumeroDeMarchas() + " marchas.");



        //LISTA 4 - EXERCICIO 3  Funcionário e Gerente

        Gerente gerente = new Gerente ("Fernanda", 1500.00, "Operaçao PV");

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: R$" + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());








    }
}