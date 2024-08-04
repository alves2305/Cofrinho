package src.moedas;

public class Euro extends Moedas {
    
    public Euro() {
        this.setNome("Euro");
        this.setValorParaReal(5.43);
    }

    @Override
    public String toString() {
        
        return "Nome : " + getNome() + "  Valor: " + getValor();
    }
    
}
