/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Igor
 */
public class Main14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Digite um valor em real:");
        String real = reader.readLine();
        
        if(!real.isEmpty()){
            double valor = Double.parseDouble(real);
            
            double resultado = valor / 5.43;
            
            System.out.println("Valor em dolares: $"+resultado);
        }
    }
    
}
