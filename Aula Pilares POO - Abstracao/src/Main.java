import exercicio1.Exibivel;
import exercicio1.Produto;
import exercicio2.ContaBancaria;
import exercicio2.OperacoesConta;
import formas.FormaGeometrica;
import formas.Quadrado;

public class Main {
    public static void main(String[] args) {

        //ABSTRACAO -> evita o acoplamento das classes, separa as coisas
        //INTERFACE -> contém somente métodos
        //POLIMORFISMO -> usar um metodo para realizar diferentes açoes

//        FormaGeometrica formaQuadrado = new Quadrado(4);
//        formaQuadrado.calcularArea();
//
//
//        //EXERCICIO 1  Produto
//
//        Exibivel exibir = new Produto("Bolacha", 10.00, "Alimento");
//        exibir.exibirDetalhes();


        //EXERCICIO 2  Conta Bancária

        OperacoesConta conta1 = new ContaBancaria("1234", 10.000);
        OperacoesConta conta2 = new ContaBancaria("5678", 20.000);

        conta1.consultarSaldo();



    }
}