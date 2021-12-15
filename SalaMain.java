package Projetos;

public class SalaMain {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Darth Vader", 21605400L);
        Aluno aluno2 = new Aluno("Luke Skywalker", 820151785L);
        Aluno aluno3 = new Aluno("Han Solo", 394851610L);

        Materia materia1 = new Materia("Engenharia de Software", "Lucas",
                "14h");
        Materia materia2 = new Materia("Banco de Dados", "Thaís",
                "10h");
        Materia materia3 = new Materia("Scrum", "Stephanie",
                "12h");

        aluno1.imprimir();
        materia1.imprimirMateria();
        aluno2.imprimir();
        materia2.imprimirMateria();
        aluno3.imprimir();
        materia3.imprimirMateria();
    }
}
