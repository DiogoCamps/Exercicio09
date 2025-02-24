package com.example.Exer09.Controller;

import com.example.Exer09.Model.Departamento;
import com.example.Exer09.Model.DepartamentoBd;
import com.example.Exer09.Model.Funcionario;
import com.example.Exer09.Model.FuncionarioBd;

import java.util.List;

public class FuncionarioController {

    FuncionarioBd
            repository = new FuncionarioBd();

    public List<Funcionario> getAll() { return repository.findAll();
    }
    public List<Funcionario> getByCurso(String curso) {
        return repository.findByCurso(curso);
    }

    public List<Funcionario> getByDepartamento(String curso) {
        return repository.findByDepartamento(curso);
    }

    public Funcionario getByld(Long id) {
        return repository.getByld(id);
    }
    public boolean insert(Funcionario funcionario) {
        return repository.insert(funcionario);
    }

    public Funcionario update(Long id, Funcionario funcionario) {
        boolean result = repository.update(id, funcionario);
        if (result) {
            return funcionario;
        }
        return null;
    }

    public boolean delete(Long id){
        return repository.delete(id);
    }
}