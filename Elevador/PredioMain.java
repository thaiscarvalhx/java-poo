package POO.Elevador;

public class PredioMain {
        public static void main(String[] args) {

            Elevador elevador1 = new Elevador(0,15,8,0);

            elevador1.inicializa();
            elevador1.situacao();

            elevador1.entra(9);
            elevador1.situacao();

            elevador1.sobe(10);
            elevador1.situacao();

            elevador1.desce(0);
            elevador1.situacao();

            elevador1.sai(2);
            elevador1.situacao();

        }
}
