/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta2;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Eduardo
 */
public class Pregunta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     int a;
     int b;
     
     a= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero de pisos" ));
     
     for(a=a;a>=0;a--)
     { 
     for(b=1;b<=a;b++)
     {
     
         System.out.print("*");
     }
         System.out.println(" ");
       }
         }
           }  
    

