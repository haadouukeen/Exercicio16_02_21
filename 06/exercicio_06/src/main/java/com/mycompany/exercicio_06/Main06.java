/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Igor
 */
public class Main06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Digite uma palavra:");
        String palavra = reader.readLine();
        String resu = "";
        
        if(!palavra.isEmpty()){
            char[] letras = palavra.toCharArray();
            
            for(int i = palavra.length()-1;i > -1;i--){
                resu += letras[i];
            }
            
            System.out.println("Resultado: "+resu);
        }
    }
    
}
