package com.poo.classe;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClasseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClasseApplication.class, args);
		Livro livro = new Livro();
		livro.setId(123);
		livro.setTitulo("programação");
		livro.setAno(2015);
		livro.setEdicao("primeira");
		livro.getAutor();
		livro.getEditor();


		ExemplarEmprestimo exemplarEmprestimo = new ExemplarEmprestimo();
		exemplarEmprestimo.setId(123);
		exemplarEmprestimo.getExemplar();
		exemplarEmprestimo.getEmprestimo();
		exemplarEmprestimo.getDevolucao();


		Devolucao devolucao = new Devolucao();
        devolucao.setId(123);
		devolucao.setData(null);

		Emprestimo emprestimo = new Emprestimo();
        emprestimo.setId(123);
		emprestimo.getExemplar();
		emprestimo.setDataEmprestimo(null);
		emprestimo.setDataDevolucao(null);
		emprestimo.getPessoa();

		Editor editor = new Editor();
		editor.setId(123);
		editor.setNome("davi");

        Autor autor = new Autor();
		autor.setId(123);
		autor.setNome("cabral");

        Exemplar exemplar = new Exemplar();
		exemplar.setId(123);
		exemplar.getLivro();

		Pessoa pessoa = new Pessoa();
		pessoa.setId(1234);
		pessoa.setRg("123fef3454");
		pessoa.setCpf("00020000000");
		pessoa.setNome("carlos");
		pessoa.getEndereco();

		Endereco endereco = new Endereco();
		endereco.setId(125);
		endereco.setUf("rj");
		endereco.setCidade("petropolis");
		endereco.setTipo("casa");
		endereco.setLogradouro(21);
		endereco.setComplemento("supindo rua 000");

	}

}
