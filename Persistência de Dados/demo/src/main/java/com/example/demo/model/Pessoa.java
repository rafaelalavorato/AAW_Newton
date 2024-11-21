package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pessoa {
    private Long id;
    private String nome;
    private String endereco;
}

