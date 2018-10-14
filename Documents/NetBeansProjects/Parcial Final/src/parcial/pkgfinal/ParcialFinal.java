/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author Carlos Eduardo
 */
public class ParcialFinal {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.println("ingrese un numero entero");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();        
        
        while(num != 0)
        {
            int num2;
            int fac=1;
            if (num > 0 )
            {
                for (int muestre=1;muestre<=num;muestre++)
                {
                    fac=fac*muestre;
                    System.out.println("el factor de " + num + " es "+ fac);                    
                }                
            }
            System.out.println("ingresar un numero");
            Scanner entrada2 = new Scanner(System.in);
            num2= entrada2.nextInt();
            num=num2;
        }
        
        
    }
    
    
}
