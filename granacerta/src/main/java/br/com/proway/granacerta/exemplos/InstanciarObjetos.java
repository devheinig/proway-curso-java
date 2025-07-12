/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.granacerta.exemplos;

import br.com.proway.granacerta.bean.Proprietario;
import javax.swing.JOptionPane;

public class InstanciarObjetos {
    //Instanciando um objeto chamado joão da classe Proprietario
    public static void main(String[] args) {
        Proprietario joao = new Proprietario();
        joao.nome = "João";
        joao.email = "joao@gmail.com";
        joao.id = 73;
        joao.cpf = "456.789.234-67";
        joao.senha = "123";
        
    //Instanciando um objeto chamado "maria" da classe Proprietario
        Proprietario maria = new Proprietario();
        maria.nome = "Maria da Silva";
        maria.email = "maria@gmail.com";
        maria.id = 73;
        maria.cpf = "456.789.234-59";
        maria.senha = "1234";
        
                
    joao.nome = "João Souza";
    
    JOptionPane.showMessageDialog(null,
            "Id:" + joao.id +
            "\nNome: " + joao.nome +
            "\nCPF: " + joao.cpf +
            "\nE-mail: " + joao.email +
            "\nID: " + maria.id +
            "\nNome: " + maria.nome +
            "\nCPF: " + maria.cpf +
            "\nE-mail: " + maria.email
    );
    }
}
