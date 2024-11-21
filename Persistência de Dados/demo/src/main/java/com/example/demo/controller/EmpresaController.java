package com.example.demo.controller;

import com.example.demo.model.Empresa;
import com.example.demo.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @PostMapping
    public Empresa criarEmpresa(@RequestBody Empresa empresa) {
        return empresaService.salvarEmpresa(empresa);
    }

    @GetMapping
    public List<Empresa> listarEmpresas() {
        return empresaService.listarEmpresas();
    }
}
