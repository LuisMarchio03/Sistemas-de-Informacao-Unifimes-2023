/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unifimes.Aula17.Exemplo01;

import javax.swing.JOptionPane;

/**
 *
 * @author alencarburiti - aula
 * 
 * 
 */
public class Paciente {

    int inicio; 
    int fim;
    int tamanho;
    int qtdeElementos;
    String f[];

    public Paciente() {
        inicio = fim = -1;
        tamanho = 10;
        f = new String[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia() {
        if (qtdeElementos == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaCheia() {
        if (qtdeElementos == tamanho - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionar(String nomePaciente) {
        if (!estaCheia()) {
            if (inicio == -1) {
                inicio = 0;
            }
            fim++;
            f[fim] = nomePaciente;
            qtdeElementos++;
        }
    }

    public void remover() {
        if (!estaVazia()) {
            inicio++;
            qtdeElementos--;
        }
    }

    public void mostrar() {
        String elementos = "";
        for (int i = inicio; i <= fim; i++) {
            elementos += f[i] + " - ";
        }
        JOptionPane.showMessageDialog(null, elementos);
    }
}
/*
public class FilaAplicacao {

    public static void main(String[] args) {
        Fila f = new Fila();
        f.adicionar(10);
        f.adicionar(12);
        f.adicionar(30);
        f.mostrar();
        f.remover();
        f.mostrar();
    }
}

*/