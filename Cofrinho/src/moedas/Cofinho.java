package src.moedas;
import src.moedas.Moedas;
import java.util.ArrayList;



public class Cofinho {

    private ArrayList <Moedas> listaMoedas;



    public Cofinho() {
        listaMoedas = new ArrayList<>();

    }



    public void adicionarMoedas(Moedas moedas) {
        listaMoedas.add(moedas);
    }


    public void removerMoedas(Moedas moedas) {
        listaMoedas.remove(moedas);
    }



    public void listarMoedas(){
        for (int i = 0; i < listaMoedas.size(); i++) {
            System.err.println((i+1) + " : " + listaMoedas.get(i) );
        }    
 
    }

    public double somarMoedas() {
        double total = 0;
        for (Moedas moeda : listaMoedas) {
            total += moeda.getValor() * moeda.getValorParaReal();
        }
        return total;
    }

    

    


}