/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Igor
 */
public class Main10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Digite um numero:");
        String num1 = reader.readLine();
        
        if(!num1.isEmpty()){
            int n1 = Integer.parseInt(num1);
            
            n1 = fatorial(n1);
            
            System.out.println("Fatorial: "+n1);
        }
    }
    
    public static int fatorial(int num){
        if(num == 0)
            return 1;
        
        return num*fatorial(num-1);
    }
}
