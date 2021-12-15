package Projetos;

public class Materia {

    private String materiaAula;
    private String professor;
    private String horario;

    public Materia(String materiaAula, String professor, String horario) {
        this.materiaAula = materiaAula;
        this.professor = professor;
        this.horario = horario;
    }

    public void imprimirMateria(){
        System.out.println(" está matriculado na disciplina " + materiaAula + " ministrada pelo(a) professor(a) " + professor + " no horário marcado para " + horario + ".");

    }
    public String getMateriaAula() {
        return materiaAula;
    }

    public void setMateriaAula(String materiaAula) {
        this.materiaAula = materiaAula;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}


