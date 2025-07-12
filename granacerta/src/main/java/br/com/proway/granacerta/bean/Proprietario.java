/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.granacerta.bean;

public class Proprietario {

    private int id;
    private String nome;
    private String cpf;
    private String email;

    // Get e Set métodos que permitem o acesso para consultar e definir valor
    // Get é um método que permite obter o valor d atributo privado
    public int getId() {
        return id;
    }

    //Set é um método que permite definir um valor para o atributo privado
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
