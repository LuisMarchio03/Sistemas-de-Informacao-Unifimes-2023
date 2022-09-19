/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crie uma classe chamada Matematic que contem os seguintes métodos:
- calcularMedia(int a, int b)
- mostrarMaiorValor(int a, int b)
- mostrarMenorValor(int a, int b)

Crie uma classe chamada MatematicTeste que 
instancie a classe Matematic e 
leia dois números 

chame cada um dos métodos passando estes números como parâmetro.


 */
package com.unifimes.Aula03.Exercicio06;

import java.util.Scanner;

/**
 *
 * @author alencarburiti
 */
public class MatematicTeste {
    
    
    public static void main(String [] args){
        Matematic matematica = new Matematic();
        
        double testeRetornoMedia;
        
        System.out.println("Primeiro número inicializado com: " + matematica.getPrimeiroNumero());
        System.out.println("Segundo número inicializado com: " + matematica.getSegundoNumero());
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número");
        matematica.setPrimeiroNumero(teclado.nextInt());
        
        System.out.println("Informe o segundo número");
        matematica.setSegundoNumero(teclado.nextInt());        
        
        testeRetornoMedia = matematica.calculaMedia(matematica.getPrimeiroNumero(), matematica.getSegundoNumero());
        System.out.println("Teste média " + testeRetornoMedia);
        
        matematica.mostrarMaiorValor(matematica.getPrimeiroNumero(), matematica.getSegundoNumero());
        matematica.mostrarMenorValor(matematica.getPrimeiroNumero(), matematica.getSegundoNumero());
        
    }
    
}
