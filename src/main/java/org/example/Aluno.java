package org.example;

public class Aluno {
    private String nome;
    private int matricula;
    private int idade;
    private Nota nota;

    public Aluno(){
        nota = new Nota();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(int primeiraNota,int segundaNota) {
        this.nota.setPrimeiraNota(primeiraNota);
        this.nota.setSegundaNota(segundaNota);
    }
}
