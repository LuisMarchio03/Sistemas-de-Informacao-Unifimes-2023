/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unifimes.Aula03.Exercicio28;

import java.util.Scanner;

/**
 *
 * @author alencarburiti
 */
public class EleitorTeste {
    
    public static void main(String [] args){
        Eleitor eleitor = new Eleitor();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o seu nome");
        
        eleitor.nome = leitor.nextLine();
        
        System.out.println("Informe a sua idade");
        
        eleitor.idade = leitor.nextInt();
        
        eleitor.verificar();
                
    }
    
}
