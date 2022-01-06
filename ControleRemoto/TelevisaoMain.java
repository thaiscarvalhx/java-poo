package POO.ControleRemoto;

public class TelevisaoMain {
    public static void main(String[] args) {

        Controle controle1 = new Controle(30, 16);

        controle1.diminuirCan();
        controle1.situacao();

        controle1.aumentarCan();
        controle1.situacao();

        controle1.diminuirV();
        controle1.situacao();

        controle1.aumentarVol();
        controle1.situacao();

        controle1.escolherCan(9);
        controle1.situacao();

    }
}
