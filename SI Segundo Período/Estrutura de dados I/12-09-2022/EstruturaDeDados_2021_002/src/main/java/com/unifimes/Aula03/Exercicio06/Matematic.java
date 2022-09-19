/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crie uma classe chamada Matematic que contem os seguintes métodos:
- calcularMedia(int a, int b)
- mostrarMaiorValor(int a, int b)
- mostrarMenorValor(int a, int b)

Crie uma classe chamada MatematicTeste que instancie a classe Matematic e leia dois
números e chame cada um dos métodos passando estes números como parâmetro.


 */
package com.unifimes.Aula03.Exercicio06;

/**
 *
 * @author alencarburiti
 */
public class Matematic {
    private double primeiroNumero;
    private double segundoNumero;
    double media;
    double menorValor;
    double maiorValor;
    
    //Construtor
    Matematic(){
        primeiroNumero = 100;
        segundoNumero = 50;
    }
    
    //Método que recebe parâmetro
    public void  setPrimeiroNumero(double a){
        primeiroNumero = a;
    }
    
    //Método com retorno
    public double getPrimeiroNumero(){
        return primeiroNumero;
    }
    
    public void setSegundoNumero(double b){
        segundoNumero = b;
    }
    
    public double getSegundoNumero(){
        return segundoNumero;
    }           
    //Método que recebe parâmetro //Método que retorna um valor
    public double calculaMedia(double primerioNumero, double segundoNumero){
        media = (primerioNumero + segundoNumero) / 2 ;        
        return media;
    }
    
    public void mostrarMaiorValor(double primeiroNumero, double segundoNumero){
        //condição - true e false
        if(primeiroNumero > segundoNumero){
            System.out.println("O maior valor é: " + primeiroNumero);
        }else{
            System.out.println("O maior valor é: " + segundoNumero);
        }
    }
    
    public void mostrarMenorValor(double primeiroNumero, double segundoNumero){
        if(primeiroNumero < segundoNumero){
            System.out.println("O menor valor é: " + primeiroNumero);
        }else{
            System.out.println("O menor valor é: " + segundoNumero);
        }
    }
    
}
