package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario extends Pessoa {
    private String email;
    private String senha;
}
