package com.poo.classe;

public class Pessoa {
private int id;
private String rg;
private String cpf;
private String nome;
private Endereco endereco;

public int getId(){
    return id;
}
public void setId(int id){
    this.id = id;
}
public String getRg(){
    return rg;
}
public void setRg(String rg){
    this.rg = rg;

}
public String getCpf(){
    return cpf;
}
public void setCpf(String cpf){
    this.cpf = cpf;
}
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public Endereco getEndereco(){
    return endereco;
}
public void setEndereco(Endereco endereco){
    this.endereco = endereco;
}
}
