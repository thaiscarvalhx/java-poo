package POO.Hotel;

public class HospedagemVip extends Hospedagem {

    public HospedagemVip(double valor) {
        super(valor);
        this.valor += adicionalValor;
    }

    private
    double adicionalValor = 120;


    public double getAdicionalValor() {
        return adicionalValor;
    }

    public void setAdicionalValor(double adicionalValor) {
        this.adicionalValor = adicionalValor;
    }

}

