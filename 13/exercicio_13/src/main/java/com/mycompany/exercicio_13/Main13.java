/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Igor
 */
public class Main13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException, ParseException {
        // TODO code application logic here
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Digite um data:");
        String data = reader.readLine();
        
        System.out.println("Digite um numero:");
        String num = reader.readLine();
        
        if(data.isEmpty() || num.isEmpty()){
            
        }else{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
            Calendar c = Calendar.getInstance(); 
            
            Date dd = formato.parse(data);
            int num1 = Integer.parseInt(num);
            c.setTime(dd);
            
            c.add(Calendar.DATE, num1);
            dd = c.getTime();
            
            System.out.println("Resultado: "+formato.format(dd));
        }
    }
    
}
