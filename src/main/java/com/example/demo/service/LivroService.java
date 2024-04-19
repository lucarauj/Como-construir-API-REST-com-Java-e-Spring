package com.example.demo.service;

import com.example.demo.entity.LivroEntity;
import com.example.demo.repository.LivroRepository;

import java.util.List;

public class LivroService {

    private LivroRepository livroRepository;

    public LivroService(){
        livroRepository = new LivroRepository();
    }

    public LivroEntity create(LivroEntity livro){
        return livroRepository.create(livro);
    }

    public List<LivroEntity> list(){
        return livroRepository.list();
    }

    public LivroEntity update(LivroEntity livroAtualizar) {
        return livroRepository.update(livroAtualizar);
    }

    public void delete(Integer id) {
        LivroEntity livroRecuperado = getLivro(id);
        livroRepository.delete(livroRecuperado);
    }

    public LivroEntity getLivro(Integer id) {
        LivroEntity livroRecuperado = livroRepository.list().stream()
                .filter(livro -> livro.getId().equals(id))
                .findFirst()
                .orElse(null);
        return livroRecuperado;
    }
}
