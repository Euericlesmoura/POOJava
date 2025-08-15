public class ContaBancaria {

    public String titular;
    public double saldo;

    public void depositar(double valor) {

        saldo = saldo + valor;
        //abreviaçao de operadores: -=  ou  +=  ou  /=

        }

    public void sacar(double valor) {

        saldo -= valor;

    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
