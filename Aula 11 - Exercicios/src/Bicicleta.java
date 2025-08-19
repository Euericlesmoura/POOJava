//CLASSE
public class Bicicleta extends Veiculo {
    private int numeroDeMarchas;



    //CONSTRUTOR
    public Bicicleta (String marca, int numeroDeMarchas) {
        super(marca);
        this.numeroDeMarchas = numeroDeMarchas;
    }



    //GET
    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }




}
