//CLASSE
public class Carro1 extends Veiculo {
    private int numeroDePortas;



    //CONSTRUTOR
    public Carro1 (String marca, int numeroDePortas) {
        super (marca);
        this.numeroDePortas = numeroDePortas;
    }



    //GET
    public int getNumeroDePortas () {
        return numeroDePortas;
    }

}
