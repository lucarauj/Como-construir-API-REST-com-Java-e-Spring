package com.example.demo.controller;

import com.example.demo.entity.LivroEntity;
import com.example.demo.service.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    private LivroService livroService;

    public LivroController() {
        livroService = new LivroService();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LivroEntity create(@RequestBody LivroEntity livro) {
        return livroService.create(livro);
    }
    @GetMapping
    public List<LivroEntity> list() {
        return livroService.list();
    }
    @PutMapping
    public LivroEntity update(@RequestBody LivroEntity livro) {
        return livroService.update(livro);
    }
    @DeleteMapping("/{idLivro}")
    public void delete(@PathVariable("idLivro") Integer id) {
        livroService.delete(id);
    }
}
