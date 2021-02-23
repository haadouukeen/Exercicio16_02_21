/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Igor
 */
public class Main15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Digite qualquer coisa:");
        String valor = reader.readLine();
        
        if(!valor.isEmpty()){
            valor = valor.replaceAll("\\D+","");
            
            System.out.println("Filtrado apenas os numeros da string: "+valor);
        }
    }
    
}
