package com.example.Exer09.View;


import com.example.Exer09.Controller.DepartamentoController;
import com.example.Exer09.Model.Departamento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
public class DepartamentoView {
    DepartamentoController departamentoController = new DepartamentoController();


    @GetMapping
    public List<Departamento> getAll(){
        return departamentoController.getAll();
    }
    @GetMapping("/{id}")
    public Departamento getByld(@PathVariable Long id){
        return departamentoController.getByld(id);
    }
    @PostMapping
    public boolean insert(@RequestBody Departamento departamento){
        return departamentoController.insert(departamento);
    }
    @PutMapping("/{id}")
    public Departamento update(@RequestBody Departamento departamento, @PathVariable Long id){
        return departamentoController.update(id, departamento);
    }
}
