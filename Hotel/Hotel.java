package POO.Hotel;

public class Hotel {
    public static void main(String[] args) {

        Hospedagem h1 = new Hospedagem(1000);
        HospedagemVip h2 = new HospedagemVip(1000);

        double hospedagem1 = h1.getValor();
        double hospedagem2 = h2.getValor();
        double valorDiferenca = hospedagem2 - hospedagem1;


        System.out.println("Hospedagem comum");
        h1.situacao();
        System.out.println("\n" + "Hospedagem VIP");
        h2.situacao();
        System.out.println("\n" + "Diferença de valores");
        System.out.println(valorDiferenca);
    }
}
