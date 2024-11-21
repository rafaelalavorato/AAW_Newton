package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Empresa {
    private Long id;
    private String nome;
    private List<PessoaFisica> pessoaFisicas; // Relacionamento muitos para muitos
    private List<PessoaJuridica> pessoaJuridicas; // Relacionamento um para muitos
}

