package org.example.telas;

import org.example.Turma;

import java.util.Scanner;

public class TelaCadastroTurma {
    Turma turmaTemp;
    public TelaCadastroTurma(){

    }
    public Turma cadastrarTurma(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas alunos deseja cadastrar nessa turma?");
        int quantidadeAlunosDaTurma = entrada.nextInt();
        System.out.println("E qual o nome desta turma?");
        String nomeTurma = entrada.next();
        turmaTemp = new Turma(nomeTurma, quantidadeAlunosDaTurma);
        return turmaTemp;
    }
}
