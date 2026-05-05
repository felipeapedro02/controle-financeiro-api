package com.felipe.controle_financeiro_api.controller;

import com.felipe.controle_financeiro_api.entity.Categoria;
import com.felipe.controle_financeiro_api.repository.CategoriaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @PostMapping
    public Categoria criar(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @GetMapping
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }
}