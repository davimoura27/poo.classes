package com.poo.classe;

public class Livro {
    private int id;
    private String titulo;
    private String edicao;
    private int ano;
    private Autor autor;
    private Editor editor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Autor geAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEdicao(Editor editor) {
        this.editor = editor;
    }

}
