package Projetos.Elevador;

public class PredioMain {
        public static void main(String[] args) {

            Elevador elevador1 = new Elevador(0,15,8,0);

            elevador1.elevadorInicializa();
            elevador1.pessoaEntra(7);
            elevador1.toString();

            elevador1.elevadorSobe(10);
            elevador1.toString();

        }
    }
