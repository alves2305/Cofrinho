package src.moedas;

public abstract class Moedas {

    // atributos pertinentes em todas as class filhas

    private String nome;
    private String pais;
    private double valor;
    private double valorParaReal;

    // set --> método utilizado para modificar atributo privado de uma class

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setValorParaReal(double valorParaReal) {
        this.valorParaReal = valorParaReal;
    }

    // get --> método utilizado para obter o valor de um atributo privado em uma
    // class

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public double getValor() {
        return valor;
    }

    public double getValorParaReal() {
        return valorParaReal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Moedas other = (Moedas) obj;
        return this.valor == other.valor;
    }

}
