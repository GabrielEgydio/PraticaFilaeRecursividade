/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Fila;

import java.util.Scanner;

/**
 *
 * @author Gabriel_Egydio
 */
public class Exercicio01 {
    public static void main(String[] args) {
        var filaMaiusculo = new char[0];
        var filaMinusculo = new char[0];
        
        final Scanner input = new Scanner(System.in);
        
        System.out.println("Insira uma cadeia de caracteres:");       
        String cadeiaValores = input.next();
        
        for (char valor : cadeiaValores.toCharArray()) {
            if (!Character.isLetter(valor))
                continue;
            
            if (Character.isUpperCase(valor))
                filaMaiusculo = adicionar(filaMaiusculo, valor);
                
            else if (Character.isLowerCase(valor))
                filaMinusculo = adicionar(filaMinusculo, valor);
        }
        
        System.out.println("Fila 1 - Caracteres em maiúsculo");
        imprimirFila(filaMaiusculo);
        
        System.out.println("Fila 2 - Caracteres em minúsculo");
        imprimirFila(filaMinusculo);
    }

    private static char[] adicionar(char[]itemsAntigos,char novoItem) {
        int novoVetor = itemsAntigos.length + 1;
        var itemsNovos = new char[novoVetor];  
        
        System.arraycopy(itemsAntigos, 0, itemsNovos, 0, itemsAntigos.length);
        
        itemsNovos[novoVetor - 1] = novoItem;
  
        return itemsNovos;
    }
    
    private static void imprimirFila(char[] fila) {
        for(char valor : fila){
            System.out.println(valor);
        }
    }
    

}