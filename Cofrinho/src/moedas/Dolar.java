package src.moedas;

public class Dolar extends Moedas {

    public Dolar() {
        this.setNome("Dolar");
        this.setValorParaReal(5.05);
    }

   


    @Override
    public String toString() {

        return "Nome : " + getNome() + "  Valor: " + getValor();
    }

    

}
