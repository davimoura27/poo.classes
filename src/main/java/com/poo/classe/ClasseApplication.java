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
		
	}

}
