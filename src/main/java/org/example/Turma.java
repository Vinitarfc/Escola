package org.example;

import org.example.telas.TelaCadastroAluno;

public class Turma {
    private final String nome;
    private final int numeroAlunos;
    private Aluno alunos[];
    public Turma(String nomeDaTurma, int numeroAlunos){
        this.nome = nomeDaTurma;
        this.numeroAlunos = numeroAlunos;
        alunos = new Aluno[numeroAlunos];
    }

    public void CadastrarAlunos(){
        TelaCadastroAluno telaCadastroAluno = new TelaCadastroAluno(numeroAlunos);
        alunos = telaCadastroAluno.cadastrarAlunos();
    }
    public void ImprimirHistoricoDaTurma(){
        System.out.println("Histórico da turma :" + this.nome);
        System.out.println("-----------------------");
        for (int i = 0; i < numeroAlunos; i++) {
            alunos[i].ImprimirTodosDados();
            //System.out.println("-----------------------");
        }
    }
}
