/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayp.figuras;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class AyPFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new scanner (System.in);
        Scanner sa=new scanner (System.in);
        Scanner sb=new scanner (System.in);
                
        System.out.println("seleccione figura a calcular");
        System.out.println("1. cuadrado");
        System.out.println("2. circulo");
        System.out.println("3. triangulo");
        System.out.println("4. circulo");
        int opcion = sc.nextInt();
        System.out.println("ingrese punto x");
        int puntox = sa.nextInt();
        System.out.println("ingrese punto y");
        int puntoy = sb.nextInt(); 
        
        
    }
    
}
