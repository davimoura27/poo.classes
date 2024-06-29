package com.poo.classe;

import java.time.LocalDateTime;

public class Emprestimo {
    private int id;
    private Exemplar exemplar;
    private LocalDateTime dataemprestimo;
    private LocalDateTime datadevolucao;
    private Pessoa pessoa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataemprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }

    public LocalDateTime getDatadevolucao() {
        return datadevolucao;
    }

    public void setDataDevolucao(LocalDateTime datadevolucao) {
        this.datadevolucao = datadevolucao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
