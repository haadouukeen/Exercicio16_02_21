/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Igor
 */
public class Main12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Digite quanto vc ganha por hora:");
        String porHora = reader.readLine();
        
        System.out.println("Digite quantas horas vc trabalhou nesse mes:");
        String horas = reader.readLine();
        
        if(porHora.isEmpty() || horas.isEmpty()){
            
        }else{
            double valor = Double.parseDouble(porHora);
            int horass = Integer.parseInt(horas);
            
            double result = valor * horass;
            
            System.out.println("Voce tem que receber R$"+result+" esse mes");
        }
    }
    
}
