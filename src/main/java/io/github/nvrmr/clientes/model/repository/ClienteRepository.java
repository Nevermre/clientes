package io.github.nvrmr.clientes.model.repository;

import io.github.nvrmr.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
