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
public class Recursividade3 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        
        int k = 0;
        int n = 0;
        
        while(k < 1) {
            System.out.println("Insira K (número inteiro e positivo):");
            k = input.nextInt();
        }
        while(n < 1) {
            System.out.println("Insira N (número inteiro e positivo):");
            n = input.nextInt();
        }
        
        int resultado = elevarKaN(k, n, 1, k);
        System.out.println("K elevado à N é: " + resultado);
    }
    
    private static int elevarKaN(int K, int N, int contMult, int valorAtual) {
        valorAtual *= K;
        contMult++;
        
        if (contMult == N)
            return valorAtual;
        else
            return elevarKaN(K, N, contMult, valorAtual);
    }
}