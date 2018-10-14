/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Carlos Eduardo
 */
public class Main { 

     
    public static void main(String[] args) throws IOException { 
         
        BufferedReader tcl= new BufferedReader(new InputStreamReader(System.in)); 
        int M[][]; 
        int n; 

        System.out.println("Ingrese la dimensión de la Matriz: "); 
        n = Integer.parseInt(tcl.readLine()); 
        M = new int[n][n];  // matriz de orden cuadrado nxn 
        llenarMatriz(M, n); 
        imprimir(M,n); 

        //Calcularemos la suma de los elementos 
        //Además aprovecharemos para imprimir la diagonal principal 
        //y hacer todo en un solo proceso: 
        int sumaArriba = 0; 
        int sumaAbajo = 0; 

        System.out.print("La diagonal principal es:    ["); 
        for (int i=0; i<n; i++) 
            for (int j=0; j<n; j++){ 
                if (i == j) 
                    System.out.print(M[i][j] +" "); 
                else if (i < j) sumaArriba += M[i][j]; 
                else sumaAbajo += M[i][j]; 
            } 
        System.out.println("]"); 

        

        System.out.println("]"); 
        System.out.println("Suma  de la diagonal :  "+ sumaArriba);
        
    } 

    // llena una matriz de orden n*n con numeros aleatorios entre 0 y 9 
    public static void llenarMatriz(int M[][], int n){ 
         
        for (int i=0; i<n; i++) 
            for (int j=0; j<n; j++) 
                M[i][j] = (int) (Math.random()*10); 
         
    }

    private static void imprimir(int[][] M, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
