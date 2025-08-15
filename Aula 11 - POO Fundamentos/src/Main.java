public class Main {
    public static void main(String[] args) {

        //Criando um Objeto -> TIPO NOME = new TIPO();


        Produto prod1 = new Produto("Monitor", 800, "Dell", 20);

        prod1.nome = "Monitor";
        prod1.preco = 850.00;
        prod1.marca = "Dell";
        prod1. mostrarInformacoes();


        Carro car1 = new Carro();

        car1.marca = "Ford";
        car1.modelo = "Fiesta";
        car1.descricao = "1.6 2007 quatro portas, manual.";

        car1.mostrarInformacoes();


    }
}