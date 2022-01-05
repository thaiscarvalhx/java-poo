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
        }
    }


    public void desce(int d){
        if(andarAtual >= totalAndares){
            this.andarAtual -= d;
        } else if(andarAtual == 0){
            System.out.println("Não há andares disponíveis.");
        }
    }

    /*------------------------------------

    --------------------------------------*/

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
}
