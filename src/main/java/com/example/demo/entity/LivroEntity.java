package com.example.demo.entity;

public class LivroEntity {
    private Integer id;
    private String nome;
    private String autor;
    private String anoDeLancamento;
    public LivroEntity(Integer id, String nome, String autor, String anoDeLancamento) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.anoDeLancamento = anoDeLancamento;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }


}
