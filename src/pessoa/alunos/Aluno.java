package pessoa.alunos;
import pessoa.Pessoa;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, int cpf, int matricula) {
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public void infoAluno(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(cpf);
        System.out.println(matricula);
    }






}
