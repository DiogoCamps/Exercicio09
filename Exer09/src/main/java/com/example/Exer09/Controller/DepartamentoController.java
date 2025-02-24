package com.example.Exer09.Controller;

import com.example.Exer09.Model.Departamento;
import com.example.Exer09.Model.DepartamentoBd;

import java.util.List;

public class DepartamentoController {

    DepartamentoBd repository = new DepartamentoBd();

    public List<Departamento> getAll() {
        return repository.findAll();
    }

    public Departamento getByld(Long id) {
        return repository.getByld(id);
    }

    public boolean insert(Departamento departamento) {
        return repository.insert(departamento);
    }

    public Departamento update(Long id, Departamento departamento) {
        boolean result = repository.update(id, departamento);
        if (result) {
            return departamento;
        }
        return null;
    }
}
