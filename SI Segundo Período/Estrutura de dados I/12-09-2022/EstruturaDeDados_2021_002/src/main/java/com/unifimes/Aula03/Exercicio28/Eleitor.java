/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unifimes.Aula03.Exercicio28;

/**
 *
 * @author alencarburiti
 */
public class Eleitor {

    String nome;
    int idade;
    
    //É um método
    public void verificar() {
        if (idade >= 18 && idade <= 65) {
            System.out.println(nome + " é um Eleitor obrigatorio!");
        }else if (idade < 16){
            System.out.println(nome + " não é eleitor");
        }else if (idade > 65){
            System.out.println(nome + " é eleitor Facultativo");
        }
    }
}
