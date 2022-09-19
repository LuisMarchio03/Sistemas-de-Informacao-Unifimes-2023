/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unifimes.Aula10.Exemplo01;

import java.util.Scanner;

/**
 *
 * @author alencarburiti
 */
public class LD_Nao_Ordenada {
    
    public static class Lista{        
        public Lista ant;
        public int num;
        public Lista prox;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Lista inicio = null;
        Lista fim = null;
        Lista anterior = null;
        Lista proximo = null;
        Lista aux;
        int operacao;
        int numero;
        int achou = 0;
        int posicao = 1;
        
        do{
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1 - Inserir no inicio da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Listar itens");
            System.out.println("4 - Remover item da lista");
            System.out.println("6 - Sair");
            
            operacao = teclado.nextInt();
            
            if (operacao == 1){
                System.out.println("Digite o número a ser inserido no início da lista");
                Lista novo = new Lista();
                novo.num = teclado.nextInt();
                if (inicio == null){
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                    novo.ant = null;
                } else{
                    novo.prox = inicio;
                    inicio.ant = novo;
                    novo.ant = null;
                    inicio = novo;
                }
            }
            if (operacao == 2){
                System.out.println("Digite o número a ser inserido no início da lista");
                Lista novo = new Lista();
                
                if( inicio == null){
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                    novo.ant = null; 
                }else{
                   fim.prox = novo;
                   novo.ant = fim;
                   novo.prox = null;
                   fim = novo;
                }
                
            }
            //# Imprimir lista
            if (operacao == 3){
                if (inicio == null){
                    System.out.println("Lista vazia");
                }else{
                    System.out.println("Imprimindo lista");
                    
                    aux = inicio;
                    while (aux != null){
                        System.out.println(aux.num);
                        aux = aux.prox;
                    }
                }
            }
            if (operacao == 4) {
                if (inicio == null) {
                    System.out.println("Lista vazia");
                } else {

                    aux = inicio;
                    while (aux != null) {
                        System.out.println("A posicao da lista " + posicao + " tem o número " + aux.num);
                        aux = aux.prox;
                        posicao++;
                    }
                    System.out.println("Digite qual o número da lista deseja excluir");
                    numero = teclado.nextInt();
                    aux = inicio;
                    anterior = null;
                    while (aux != null) {
                        if (aux.num == numero) {
                            achou++;
                            if (aux == inicio) {
                                inicio = aux.prox;
                                aux = inicio;
                            } else if (aux == fim) {
                                anterior.prox = null;
                                fim = anterior;
                                aux = null;
                            } else {
                                anterior.prox = aux.prox;
                                aux = null;
                            }
                        } else {
                            anterior = aux;
                            aux = aux.prox;
                        }
                    }
                }
            }
        }while(operacao != 6);
    }
    
}
