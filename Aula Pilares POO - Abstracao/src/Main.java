import exercicio1.Exibivel;
import exercicio1.Produto;
import exercicio2.ContaBancaria;
import exercicio2.OperacoesConta;
import exercicio3.Concluivel;
import exercicio3.Tarefa;
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

//        OperacoesConta conta = new ContaBancaria("123", 10000.00);
//        OperacoesConta conta1 = new ContaBancaria("456", 0);
//
//        conta.consultarSaldo();
//        conta.depositar(5000);
//        conta.sacar(1000.00);
//        conta.transferir((ContaBancaria) conta1, 7000.00);
//        conta1.consultarSaldo();



        //EXERCICIO 3  Tarefa  **nao terminada**

        Concluivel tarefa = new Tarefa("Relatório", true);

        tarefa.exbirStatus();




    }
}