/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unifimes.Aula22.Exemplo01;

/**
 *
 * @author alencarburiti
 */
public class Exemplo01Arranjo {
    static int[][] vetor = new int[3][3];
    static int numero = 1;
    
    public static void main(String[] args) {
        populaVetor();
        consultaVetor(2, 1);                        
    }    
    public static void consultaVetor(int i, int j){
        System.out.println("Resultado: " + vetor[i][j]);
    }    
    public static void populaVetor(){
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor[i].length; j++){                
                vetor[i][j] = numero;
                System.out.print(vetor[i][j] + "--");
                numero += 2;                
            }
            System.out.println("");
        }  
    }
}
