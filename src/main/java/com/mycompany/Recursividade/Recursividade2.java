/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Recursividade;

import java.util.Scanner;

/**
 *
 * @author Gabriel_Egydio
 */
public class Recursividade2 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int n = 0;
        
        while(n < 1) {
            System.out.println("Insira um número inteiro e positivo:");
            n = input.nextInt();
        }
        
        System.out.println("Números naturais de 0 até N em ordem crescente:");
        imprimirNumeros(0, n);
    }
    
    private static void imprimirNumeros(int numeroAtual, int N) {
        System.out.println(numeroAtual);
        
        if (numeroAtual < N) {
            numeroAtual++;
            imprimirNumeros(numeroAtual, N);
        }
    }
}

