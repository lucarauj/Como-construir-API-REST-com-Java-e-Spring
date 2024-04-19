package com.example.demo.repository;

import com.example.demo.entity.LivroEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LivroRepository {
    private static List<LivroEntity> listaLivros = new ArrayList<>();
    private AtomicInteger COUNTER = new AtomicInteger();
    public LivroRepository() {
        listaLivros.add(new LivroEntity(COUNTER.incrementAndGet(),
                "Grande Sertão: Veredas", "João Guimarães Rosa", "1956"));
        listaLivros.add(new LivroEntity(COUNTER.incrementAndGet(),
                "Dom Casmurro", "Machado de Assis", "1899"));
        listaLivros.add(new LivroEntity(COUNTER.incrementAndGet(),
                "Capitães da Areia", "Jorge Amado", "1937"));
        listaLivros.add(new LivroEntity(COUNTER.incrementAndGet(),
                "Memórias Póstumas de Brás Cubas", "Machado de Assis", "1881"));
    }

    public LivroEntity create(LivroEntity livro) {
        livro.setId(COUNTER.incrementAndGet());
        listaLivros.add(livro);
        return livro;
    }
    public List<LivroEntity> list() {
        return listaLivros;
    }
    public LivroEntity update(LivroEntity livroAtualizado) {
        for (int i = 0; i < listaLivros.size(); i++) {
            LivroEntity livroExistente = listaLivros.get(i);
            if (livroExistente.getId() == livroAtualizado.getId()) {
                listaLivros.set(i, livroAtualizado);
                return livroAtualizado;
            }
        }
        return null;
    }
    public void delete(LivroEntity livro) {
        listaLivros.remove(livro);
    }
}
