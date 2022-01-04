package Projetos.Sala;

public class Aluno {

    private String nome;
    private Long ra;

    public Aluno(String nome, Long ra) {
        this.nome = nome;
        this.ra = ra;

    }

    public void imprimir(){
        System.out.println("O aluno " + nome + ", com RA " + ra + ", ");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getRa() {
        return ra;
    }

    public void setRa(Long ra) {
        this.ra = ra;
    }

}
