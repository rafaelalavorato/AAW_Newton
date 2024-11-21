package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaJuridica extends Usuario {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private Empresa empresa; // Relacionamento muitos para um com Empresas
}

