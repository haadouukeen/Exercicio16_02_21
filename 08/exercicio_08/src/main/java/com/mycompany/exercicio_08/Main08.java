/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor
 */
public class Main08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Digite um numero:");
        String num1 = reader.readLine();
        
        System.out.println("Digite outro numero:");
        String num2 = reader.readLine();
        
        if(num1.isEmpty() || num2.isEmpty()){
            
        }else{
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            ArrayList<Integer> numeros = new ArrayList<>();
            
            n1++;
            while(n1 != n2){
                numeros.add(n1);
                n1++;
            }
            
            for(Integer ii : numeros){
               int resto = ii % 2;
               
               if(resto != 0){
                   System.out.println("Impar: "+ii);
               }
            }
        }
    }
    
}
