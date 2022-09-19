/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unifimes.Aula23.Exercicio05;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author alencarburiti
 */
public class Exercicio05 {

    static String[][][] atendentes = new String[4][11][6];
    static int opcao = 0;
    static int opLista = 0;
    static Scanner teclado = new Scanner(System.in);
    static int opWhile = 0;
    static String nomePessoa = "";
    static String horaInicio = "";
    static String horaFim = "";
    static Timestamp hora;
    static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        
    public static void main(String[] args) {
        inicializarTudo();
        menu();
    }

    public static void inicializarTudo() {
        for (int i = 0; i < atendentes.length; i++) {
            for (int j = 0; j < atendentes[i].length; j++) {
                for (int x = 0; x < atendentes[i][j].length; x++) {
                    atendentes[i][j][x] = new String();
                }
            }
        }
    }

    // método para entrar na fila
    public static void entrarNaFila(int op, String nomePessoa, String horaInicio) {
        System.out.println("Verificando ");
        while (opWhile < 11) {
            System.out.println(atendentes[op][opWhile][1]);
            if (atendentes[op - 1][opWhile][1].isEmpty()) {
                atendentes[op - 1][opWhile][1] = nomePessoa;                
                Date dateIni = new Date(System.currentTimeMillis());
                atendentes[op - 1][opWhile][2] = formatter.format(dateIni);        
                atendentes[op - 1][opWhile][4] = "Atendendo";
                break;
            }
            opWhile += 1;
        }
    }
    
    public static void encerrarAtendimento(){
        int posicaoAtendente;
        int posicaoPessoa;
        mostrarPessoasNaFila();
        System.out.println("Informe a atendente");
        posicaoAtendente = teclado.nextInt();
        System.out.println("Informe o ID do cliente");
        posicaoPessoa = teclado.nextInt();
        Date dateFim = new Date(System.currentTimeMillis());
        atendentes[posicaoAtendente-1][posicaoPessoa-1][3] = formatter.format(dateFim);
        atendentes[posicaoAtendente-1][posicaoPessoa-1][4] = "Finalizado";        
        //hora fim
    }

    // método para mostrar a quantidade de pessooas na fila    
    public static void mostrarQuantidadeFila() {
        int qtdPessoaFila = 0;
        for (int i = 0; i < atendentes.length; i++) {
            for (int j = 0; j < atendentes[i].length; j++) {
                if (!atendentes[i][j][1].isEmpty() && atendentes[i][j][4] == "Atendendo") {
                    qtdPessoaFila += 1;
                }
            }
            System.out.println("Atendente: " + (i + 1) + " Qtd: " + qtdPessoaFila);
            qtdPessoaFila = 0;
        }
    }

    public static void mostrarPessoasNaFila() {
        for (int i = 0; i < atendentes.length; i++) {
            for (int j = 0; j < atendentes[i].length; j++) {
                System.out.println("Atendente: " + (i + 1) + "| ID: " + (j+1) + 
                        " | Nome pessoa na fila: " + atendentes[i][j][1] + " | "
                                + "Hora Inicial: " + atendentes[i][j][2] + " | Hora Final: " + atendentes[i][j][3] +  " | Status Atendimento: " + atendentes[i][j][4]);
            }
        }
    }

    // método para remover a pessoa da fila
    public static void menu() {
        System.out.println("1 - Solicitar atendimento");
        System.out.println("2 - Encerra atendimento");
        System.out.println("3 - Lista filas");
        System.out.println("4 - Sair do atendimento");
        opcao = teclado.nextInt();

        if (opcao == 1) {
            mostrarQuantidadeFila();
            System.out.println("Escolha qual o número da lista");
            opLista = teclado.nextInt();
            if (opLista >= 1 && opLista <= 4) {
                System.out.println("Informe o nome da pessoa na fila");
                nomePessoa = teclado.next();
                System.out.println("Informa a hora de entrada na fila");
                horaInicio = teclado.next();
                entrarNaFila(opLista, nomePessoa, horaInicio);

                menu();
            } else {
                System.out.println("Opção da lista inválida");

                menu();
            }
        } else if (opcao == 2) {
            encerrarAtendimento();
            menu();
        } else if (opcao == 3) {
            mostrarPessoasNaFila();
            menu();
        }
    }

}
