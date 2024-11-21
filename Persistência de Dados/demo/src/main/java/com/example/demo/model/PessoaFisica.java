package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class PessoaFisica extends Usuario {
    private String cpf;
    private LocalDate dataNascimento;
    private List<Empresa> empresas; // Relacionamento muitos para muitos com Empresas
}

