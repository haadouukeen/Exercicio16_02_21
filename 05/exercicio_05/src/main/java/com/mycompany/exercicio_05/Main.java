/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Igor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException{
        // TODO code application logic here
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Digite um caminho de um arquivo .txt:");
        String name = reader.readLine();
        
        System.out.println("Digite uma palavra:");
        String pala = reader.readLine();
        
        if(name.isEmpty() || pala.isEmpty()){
            
        }else{
            
            List<String> files = Files.readAllLines(Paths.get(name));
            int i = 0;

            for(String l : files){
                
                
            }

            System.out.println("Palavra "+pala+" foi citada "+i+" vezes");
        }
        
    }
    
}
