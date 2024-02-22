package com.sisvendas.sisvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sisvendas.sisvendas.models.Pedido; // Importe a classe Pedido corretamente

public interface IPedidoRepository extends JpaRepository<Pedido, Long> {

}
