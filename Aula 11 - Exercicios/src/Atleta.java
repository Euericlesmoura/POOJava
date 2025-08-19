//Criando a classe
public class Atleta extends Pessoa {
    protected String esporte;


    //Criando metodo construtor


    public Atleta(String nome, String esporte) {
        super(nome);
        this.esporte = esporte;
    }


    //Criando GET

    public String getEsporte(){
        return esporte;
    }
}

