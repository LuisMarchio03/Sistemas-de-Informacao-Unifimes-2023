/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unifimes.Aula11.Exemplo01Pilha;

import java.util.Scanner;

/**
 *
 * @author alencarburiti
 */
public class PilhaTeste {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);        
        Pilha pilha = new Pilha();
        int op;
        do {
            System.out.println("MENU DE OPÇÕES\n");
            System.out.println("l - Inserir na pilha ");
            System.out.println("2 - Consultar toda a pilha");
            System.out.println("3 - Remover da pilha");
            System.out.println("4 - Esvaziar a pilha");
            System.out.println("5 - Sair             ");
            System.out.print("Digite sua opção: ");
            op = entrada.nextInt();
            if (op < 1 || op > 5) {
                System.out.println("Opção inválida !! ");
            }
            if (op == 1) {
                System.out.println("Digite o número a ser inserido na pilha: ");
                String nome = entrada.next();
                pilha.push(nome);
            }
            if (op == 2) {
                pilha.listarPilha();
            }
            if (op == 3) {
                pilha.pop();
            }
            if (op == 4) {
                pilha.esvaziarLista();
            }
        } while (op != 5);
    }
}
