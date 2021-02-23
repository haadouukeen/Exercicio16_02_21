/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Igor
 */
public class Main07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Digite um numero:");
        String num1 = reader.readLine();
        
        System.out.println("Digite outro numero:");
        String num2 = reader.readLine();
        
        if(num1.isEmpty() || num2.isEmpty()){
            
        }else{
            
            int resu = Integer.parseInt(num1) - Integer.parseInt(num2);

            System.out.println("Intervalo entre os numeros: "+resu);
        }
        
    }
    
}
