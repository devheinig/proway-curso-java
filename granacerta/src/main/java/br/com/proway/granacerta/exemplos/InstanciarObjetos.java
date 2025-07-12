/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.granacerta.exemplos;

import br.com.proway.granacerta.bean.Conta;
import br.com.proway.granacerta.bean.Proprietario;
import javax.swing.JOptionPane;

public class InstanciarObjetos {

    //Instanciando um objeto chamado joão da classe Proprietario
    public static void main(String[] args) {
        Proprietario joao = new Proprietario();
        //  joao.nome = "João";
        joao.setNome("João");
        //  joao.email = "joao@gmail.com";
        joao.setEmail("joao@gmail.com");
        //  joao.id = 73;
        joao.setId(98);
        //  joao.cpf = "456.789.234-67";
        joao.setCpf("456.789.234-67");

        //Instanciando um objeto chamado "maria" da classe Proprietario
        Proprietario maria = new Proprietario();
        //  maria.nome = "Maria da Silva";
        maria.setNome("Maria da Silva");
        //  maria.email = "maria@gmail.com";
        maria.setEmail("maria@gmail.com");
        //  maria.id = 67;
        maria.setId(67);
        //  maria.cpf = "456.789.234-59";
        maria.setCpf("456.789.234-59");

        JOptionPane.showMessageDialog(null,
                "Id:" + joao.getId()
                + "\nNome: " + joao.getNome()
                + "\nCPF: " + joao.getCpf()
                + "\nE-mail: " + joao.getEmail()
                + "\nID: " + maria.getId()
                + "\nNome: " + maria.getNome()
                + "\nCPF: " + maria.getCpf()
                + "\nE-mail: " + maria.getEmail()
        );

        Conta viacredi = new Conta();
        //  viacredi.id = 89;
        viacredi.setId(89);
        //  viacredi.nome = "Sérgio";
        viacredi.setNome("Sérgio");
        //  viacredi.tipo = "Poupança";
        viacredi.setTipo("Poupança");
        //  viacredi.saldo = 128.354;
        viacredi.setSaldo(128.354);

        Conta itau = new Conta();
        //  itau.id = 54;
        itau.setId(54);
        //  itau.nome = "Luciano";
        itau.setNome("Luciano");
        //  itau.tipo = "Salário";
        itau.setTipo("Salário");
        //  itau.saldo = 178.814;
        itau.setSaldo(178.814);

        Conta santander = new Conta();
        //  santander.id = 25;
        santander.setId(25);
        //  santander.nome = "Juliana";
        santander.setNome("Juliana");
        //  santander.tipo = "Poupança";
        santander.setTipo("Poupança");
        //  santander.saldo = 192.114;
        santander.setSaldo(192.114);

        JOptionPane.showMessageDialog(null,
                "Id:" + viacredi.getId()
                + "\nNome: " + viacredi.getNome()
                + "\nCPF: " + viacredi.getTipo()
                + "\nSaldo: " + viacredi.getSaldo()
                + "Id:" + itau.getId()
                + "\nNome: " + itau.getNome()
                + "\nCPF: " + itau.getTipo()
                + "\nSaldo: " + itau.getSaldo()
                + "Id:" + santander.getId()
                + "\nNome: " + santander.getNome()
                + "\nCPF: " + santander.getTipo()
                + "\nSaldo: " + santander.getSaldo()
        );
    }
}
