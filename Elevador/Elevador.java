package POO.Elevador;

public class Elevador {

    private
    Integer andarAtual;
    Integer totalAndares;
    Integer capacElevador;
    Integer pessoasPresentes;

    public Elevador(Integer andarAtual, Integer totalAndares, Integer capacElevador, Integer pessoasPresentes) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacElevador = capacElevador;
        this.pessoasPresentes = pessoasPresentes;
    }

    public String situacao() {
        System.out.println("\n" + "{" +
                "Andar atual = " + andarAtual +
                ", pessoas presentes = " + pessoasPresentes + "\n" +
                "Total de andares = " + totalAndares +
                ", capacidade máxima no elevador = " + capacElevador +
                '}');
        return null;
    }

    /*------------------------------------
                    FUNÇÕES
    --------------------------------------*/


    public void inicializa(){
        this.andarAtual = 0;
        this.totalAndares = 15;
        this.capacElevador = 8;
        this.pessoasPresentes = 0;
    }

<<<<<<< HEAD

    public void entra(int e){
        if(e < capacElevador) {
            this.pessoasPresentes += e;
        } else if(capacElevador < e) {
            this.pessoasPresentes = capacElevador;
            System.out.println("A capacidade máxima foi atingida.");
        }
    }


    public void sai(int s){
        if(s > 0){
            this.pessoasPresentes -= s;
        } else if (s <= 0) {
            System.out.println("Não há ninguém neste elevador.");
        }
    }

    public void sobe(int a){
        if(a < totalAndares) {
            this.andarAtual += a;
        } else if (a > totalAndares) {
            System.out.println("Não há andares disponíveis.");
=======
    public void elevadorSobe(int s) {
        if (andarAtual < totalAndares) {
            this.andarAtual = andarAtual + s;
        } else if (andarAtual >= totalAndares) {
            this.andarAtual = totalAndares;
        }
    }

        public void elevadorDesce(int d){
            this.andarAtual = d;
        }

        public void pessoaEntra(int e){
            if (pessoasPresentes < capacElevador) {
                this.pessoasPresentes = pessoasPresentes + e;
            } else if (pessoasPresentes > capacElevador) {
                this.pessoasPresentes = capacElevador;
            }
>>>>>>> a2f57b6447ae40073a6674260a59a01b654263e7
        }

<<<<<<< HEAD

    public void desce(int d){
        if(andarAtual >= totalAndares){
            this.andarAtual -= d;
        } else if(andarAtual == 0){
            System.out.println("Não há andares disponíveis.");
        }
    }

    /*------------------------------------

    --------------------------------------*/
=======
        public void pessoaSai(int a){
            if (pessoasPresentes < capacElevador) {
                this.pessoasPresentes = pessoasPresentes - a;
            } else if (pessoasPresentes > capacElevador) {
                this.pessoasPresentes = capacElevador;
            }
        }
    /*----------------------------------
                   GETTER & SETTER*/
>>>>>>> a2f57b6447ae40073a6674260a59a01b654263e7

        public Integer getAndarAtual () {
            return andarAtual;
        }

        public void setAndarAtual (Integer andarAtual){
            this.andarAtual = andarAtual;
        }

        public Integer getTotalAndares () {
            return totalAndares;
        }

        public void setTotalAndares (Integer totalAndares){
            this.totalAndares = totalAndares;
        }

        public Integer getCapacElevador () {
            return capacElevador;
        }

        public void setCapacElevador (Integer capacElevador){
            this.capacElevador = capacElevador;
        }

        public Integer getPessoasPresentes () {
            return pessoasPresentes;
        }

<<<<<<< HEAD
    public void setPessoasPresentes(Integer pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}
=======
        public void setPessoasPresentes (Integer pessoasPresentes){
            this.pessoasPresentes = pessoasPresentes;
        }

        //----------------------------------//

        @Override
        public String toString () {
            System.out.println("Projetos.Elevador.Elevador{" +
                    "Andar atual = " + andarAtual +
                    ", total de andares = " + totalAndares +
                    ", capacidade do elevador = " + capacElevador +
                    ", pessoas presentes = " + pessoasPresentes +
                    '}');
            return null;
        }
    }
>>>>>>> a2f57b6447ae40073a6674260a59a01b654263e7
