package Projetos.Elevador;

public class Elevador {

    private Integer andarAtual = 0;
    private Integer totalAndares = 15;
    private Integer capacElevador = 8;
    private Integer pessoasPresentes = 0;


    public Elevador(Integer andarAtual, Integer totalAndares, Integer capacElevador, Integer pessoasPresentes) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacElevador = capacElevador;
        this.pessoasPresentes = pessoasPresentes;
    }

    /*----------------------------------
                   FUNÇÕES*/

    public void elevadorInicializa() {
        this.andarAtual = 0;
        this.totalAndares = 15;
        this.capacElevador = 8;
        this.pessoasPresentes = 0;
    }

    public void elevadorSobe(int s) {
        this.andarAtual = s;
    }

    public void elevadorDesce(int d) {
        this.andarAtual = d;
    }

    public void pessoaEntra(int e) {
        if (pessoasPresentes < capacElevador) {
            this.pessoasPresentes = pessoasPresentes + e;
        } else if (pessoasPresentes > capacElevador) {
            this.pessoasPresentes = capacElevador;
        }
    }

    public void pessoaSai(int a) {
        if (pessoasPresentes < capacElevador) {
            this.pessoasPresentes = pessoasPresentes - a;
        } else if (pessoasPresentes > capacElevador) {
            this.pessoasPresentes = capacElevador;
        }
    }
    /*----------------------------------
                   GETTER & SETTER*/

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Integer getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(Integer totalAndares) {
        this.totalAndares = totalAndares;
    }

    public Integer getCapacElevador() {
        return capacElevador;
    }

    public void setCapacElevador(Integer capacElevador) {
        this.capacElevador = capacElevador;
    }

    public Integer getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(Integer pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    //----------------------------------//

    @Override
    public String toString() {
        System.out.println("Projetos.Elevador.Elevador{" +
                "Andar atual = " + andarAtual +
                ", total de andares = " + totalAndares +
                ", capacidade do elevador = " + capacElevador +
                ", pessoas presentes = " + pessoasPresentes +
                '}');
        return null;
    }
}

