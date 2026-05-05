package com.felipe.controle_financeiro_api.repository;

import com.felipe.controle_financeiro_api.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}