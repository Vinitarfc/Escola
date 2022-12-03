package org.example.telas;

import org.example.Aluno;

import java.util.Scanner;

public class TelaCadastroAluno {
    private int numeroAlunos;
    private Aluno alunosTemp[];
    public TelaCadastroAluno(int numeroAlunos){
        this.numeroAlunos = numeroAlunos;
    }

    public Aluno[] cadastrarAlunos(){
        alunosTemp = new Aluno[numeroAlunos];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeroAlunos; i++) {
            alunosTemp[i] = new Aluno();
            System.out.println("Qual nome deste aluno?");
            alunosTemp[i].setNome(entrada.next());
            System.out.println("Qual a matricula deste aluno?");
            alunosTemp[i].setMatricula(entrada.nextInt());
            System.out.println("Qual idade deste aluno?");
            alunosTemp[i].setIdade(entrada.nextInt());
            System.out.println("Qual 1° nota deste aluno?");
            int primeiraNota = entrada.nextInt();
            System.out.println("Qual 2° nota deste aluno?");
            int segundaNota = entrada.nextInt();
            alunosTemp[i].setNota(primeiraNota, segundaNota);
        }
        return alunosTemp;
    }
}
