package com.example.Exer09.Model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FuncionarioBd {

    private List<Funcionario> funcionarios;

    public FuncionarioBd() {
        this.funcionarios = new ArrayList<>();
    }

    //busca todos
    public List<Funcionario> findAll() {
        return new ArrayList<>(funcionarios);
    }

    public List<Funcionario> findByCurso(String curso) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.getCurso().equals(curso))
                .toList();
    }

    //busca com base no id
    public Funcionario getByld(Long id) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.getId() == id)
                .findFirst()
                .orElse(null);
    }

    //inserir funcionario
    public boolean insert(Funcionario funcionario) {
        funcionarios.add(funcionario);
        return true;
    }

    //atualizar o funcionario
    public boolean update(Long id, Funcionario funcionario) {
        Funcionario funcionarioBd = funcionarios.stream()
                .filter(func -> func.getId() == id)
                .findFirst()
                .orElse(null);
        if (funcionarioBd == null) {
            return false;
        }
        funcionarioBd.setNome(funcionario.getNome());
        return true;
    }

    public boolean delete(Long id) {
        Funcionario funcionarioBd = funcionarios.stream()
                .filter(func -> func.getId() == id)
                .findFirst()
                .orElse(null);

        if (funcionarioBd == null) {
            return false;
        }
        funcionarios.remove(funcionarioBd);

        return true;
    }

    public List<Funcionario> findByDepartamento(String nomeDepartamento) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.getDepartamento().getNome()
                        .equals(nomeDepartamento))
                .toList();
    }

    //public List<Funcionario> funcionariosOrdenados() {
        //return funcionarios.stream()
                //.sorted((func1, func2) -> Double.compare(func2.getSalario()func1.getSalario()))
                //.toList();

    //}
    public List<Funcionario> funcionariosOrdenados() {
        return funcionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getSalario).reversed())
                .toList();
    }
}

