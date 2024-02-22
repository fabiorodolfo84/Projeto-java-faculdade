package com.sisvendas.sisvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository; // Correção na importação

import com.sisvendas.sisvendas.models.Cliente;

// Correção na declaração da interface
public interface IClienteRepository extends JpaRepository<Cliente, Long> {

}
