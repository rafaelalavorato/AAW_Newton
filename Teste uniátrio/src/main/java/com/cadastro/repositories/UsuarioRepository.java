package com.cadastro.repositories;

@Repository // Marca esta interface como um repositório do Spring, permitindo que seja
gerenciada pelo contêiner de injeção de dependências do Spring.
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
// Esta interface herda os métodos padrão de JpaRepository para operações CRUD
(Create, Read, Update, Delete).
// JpaRepository<Usuario, Long> indica que esta interface gerencia a entidade Usuario e que o tipo do ID da entidade é Long.
}
