public class ContaBancaria {

    private String titular;
    private double saldo;

    public void depositar(double valor) {

        saldo = saldo + valor;
        //abreviaçao de operadores: -=  ou  +=  ou  /=
    }

    public void sacar(double valor) {

        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    //METODOTO CONSTRUTOR
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
