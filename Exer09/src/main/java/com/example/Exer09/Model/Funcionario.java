package com.example.Exer09.Model;

public class Funcionario {

    private Long id;
    private String nome;
    private String sobrenome;
    private String curso;
    private double salario;
    private Departamento departamento;

    public Funcionario(Long id, String nome, String sobrenome, String curso, double salario, Departamento departamento){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCurso() {
        return curso;
    }

    public double getSalario() {
        return salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
