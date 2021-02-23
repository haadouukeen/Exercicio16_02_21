/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Igor
 */
public class Main11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException, ParseException {
        // TODO code application logic here
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Digite sua data de nascimento:");
        String data = reader.readLine();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        
        if(!data.isEmpty()){
            Date dd = formato.parse(data);
            Date agora = new Date(System.currentTimeMillis());
            
            long diferençaAnos  = ((agora.getTime() - dd.getTime()) / (1000*60*60*24) / 30) / 12;
            
            System.out.println("Voce tem "+diferençaAnos+" anos de idade");
        }
    }
    
}
