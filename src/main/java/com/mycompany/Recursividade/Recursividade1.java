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
public class Recursividade1 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um número N:");     
        int n = input.nextInt();
        
        int soma = calcSomatorio(0, 1, n);
        
        System.out.println("Somatório de 1 a N:");
        System.out.println(soma);
    }
    
    private static int calcSomatorio(int soma, int numeroAtual, int n) {
        soma += numeroAtual;
        numeroAtual++;            
        
        if (numeroAtual > n)
            return soma;
        else
            return calcSomatorio(soma, numeroAtual, n);
    }
}
