package exercicio2;

//CRIANDO CLASSE QUE HERDA INTERFACE
public class ContaBancaria implements OperacoesConta {

    protected String numeroConta;
    private double saldo;


    //CRIANDO CONSTRUTOR


    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    //GET E SET


    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    //CRIANDO METODO
    @Override
    public void depositar(double valor) {

        saldo += valor;
        System.out.println("Operaçao realizado com sucesso !");

        consultarSaldo();
    }

    @Override
    public void sacar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso !");
        }
        else {
            System.out.println("Valor indisponível seu probre ...");
        }

        consultarSaldo();
    }

    @Override
    public double consultarSaldo() {
        System.out.println("O saldo é: " + getSaldo());
        return saldo;
    }

    @Override
    public void transferir(ContaBancaria contaDestino, double valorTransf) {

        sacar(valorTransf);
        contaDestino.depositar(valorTransf);
    }
}
