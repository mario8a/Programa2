/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//CARACTERES REPETIDOS
package programa2compiladores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Programa2Compiladores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //Abrir el archivo
        FileReader fr = new FileReader("archivo.txt");
        //leer caracter a caracter
        BufferedReader br = new BufferedReader(fr);
        //leer el primer caracter
        int caracterASCII = br.read();
        
        Scanner lector = new Scanner(br);
        String  cadena = "";
        char [] Arraycadena ;
        char caracter;
        int contador = 0;

        cadena = lector.nextLine();
        Arraycadena = cadena.toCharArray();
        
         
         
         
        while(caracterASCII != -1)
        {
            contador++;
            caracterASCII = br.read();
           
            for(int i = 0; i < Arraycadena.length; i++){
            caracter = Arraycadena[i];
            for(int j = 0; j < Arraycadena.length; j++){
                if(Arraycadena[j] == caracter){
                    contador++;
                }
            }
            System.out.println(Arraycadena[i]+" "+ contador);
            contador=0;
            }
        }
        
        
        
        
        /*for(int i = 0; i < Arraycadena.length; i++){
            caracter = Arraycadena[i];
            for(int j = 0; j < Arraycadena.length; j++){
                if(Arraycadena[j] == caracter){
                    contador++;
                }
            }
            System.out.println(Arraycadena[i]+" "+ contador);
            contador=0;
        }*/
                
    }
    
}
