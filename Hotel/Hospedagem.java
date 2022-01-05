package POO.Hotel;

public class Hospedagem {

    public double valor;


    public String situacao() {
        System.out.println("Valor = " + valor);
        return null;
    }


    public Hospedagem(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
