/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta7;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Eduardo
 */
public class Pregunta7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int filas=Integer.parseInt(JOptionPane.showInputDialog("Digita las filas de las matries"));
        int columnas=Integer.parseInt(JOptionPane.showInputDialog("Digita las columnas de las matrices"));
        int matrizA[][]=new int[filas][columnas];
        int matrizB[][]=new int[filas][columnas];
        int matrizRes[][]=new int[filas][columnas];
        
        //Escribir datos en la matrizA
System.out.println("Datos de la Matriz A:");
for(int i=0;i<filas;i++){
        for(int j=0;j<columnas;j++){
                matrizA[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digita un número para la posición: a["+i+"]["+j+"]"+" de la matriz A"));
                System.out.print(matrizA[i][j]+" ");
        }
        System.out.println();
}

//Escribir datos en la matrizB
System.out.println("Datos de la Matriz B:");
for(int i=0;i<filas;i++){
        for(int j=0;j<columnas;j++){
                matrizB[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digita un número para la posición: a["+i+"]["+j+"]"+" de la matriz B"));                            
                System.out.print(matrizB[i][j]+" ");
        }
        System.out.println();
}
System.out.println("Suma de las dos matrices:");
for(int i=0;i<filas;i++){
        for(int j=0;j<columnas;j++){
                matrizRes[i][j]=matrizA[i][j]+matrizB[i][j];                            
                System.out.print(matrizRes[i][j]+" ");
        }
        System.out.println();
          }
    }
    
}
        
        
    
    

