/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

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
        
        String name = reader.readLine();
        
        if(!name.isEmpty()){
            File folder = new File(name);
            File[] listOfFiles = folder.listFiles();

            for (int i = 0; i < listOfFiles.length; i++) {
                System.out.println(listOfFiles[i].getName());

              }
        }
        
        
    }
    
}
