package org.example;

import org.example.telas.TelaCadastroTurma;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TelaCadastroTurma telaCadastroTurma = new TelaCadastroTurma();
        Turma turma = telaCadastroTurma.cadastrarTurma();
        turma.CadastrarAlunos();
    }

}
