package src.moedas;

public class Real extends Moedas {
    
    public Real() {
        this.setNome("Real");
        this.setValorParaReal(1);
    }

    

    @Override
    public String toString() {
        
        return "Nome : " + getNome() + "  Valor: " + getValor();
    }
    
    
}
