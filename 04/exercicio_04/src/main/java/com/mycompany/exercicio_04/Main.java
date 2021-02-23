/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.IOException;
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
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Digite um caminho de um arquivo .txt:");
        String name = reader.readLine();
        
        if(!name.isEmpty()){
            
            List<String> files = Files.readAllLines(Paths.get(name));

            for(String l : files){
                System.out.println(l);
            }
        }
        
    }
    
}
