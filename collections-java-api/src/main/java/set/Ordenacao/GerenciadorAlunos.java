package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        for (Aluno aluno: alunos){
            if (aluno.getMatricula().equals(matricula)) {
                alunos.remove(aluno);
                return;
            };
        }
        throw new RuntimeException("Aluno não matriculado!");
    }

    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(alunos);
    }

    public Set<Aluno> exibirAlunosPorMedia(){
        Set<Aluno> ordenar = new TreeSet<>(new ComparatorPorMedia());
        ordenar.addAll(alunos);
        return ordenar;

    }

    public void exibirAlunos(){
        System.out.println(new HashSet<>(alunos));
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();


        gerenciadorAlunos.adicionarAluno("Jonas", 123L, 9.4);
        gerenciadorAlunos.adicionarAluno("Roberto", 124L, 9.8);
        gerenciadorAlunos.adicionarAluno("Renata", 125L, 7.1);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorMedia());

        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(124);
        gerenciadorAlunos.exibirAlunos();


    }

}
