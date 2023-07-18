/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucionejercicio;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class RESOLUCIONEJERCICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner edad=new Scanner(System.in);
        int edadHermano1,edadHermano2;
        int diferencia;
        
        System.out.println("Ingresa la edad del primer Hermano:\n" );
        edadHermano1= edad.nextInt();
        System.out.println("Ingresa la edas del segundo Hermano:\n");
        edadHermano2= edad.nextInt();

        //Mi Parte del proyecto
        if(edadHermano1 > edadHermano2)
        {
            diferencia = edadHermano1 - edadHermano2;
            System.out.println("El primer Hermano tiene: " + edadHermano1 + " años, y es mayor por: " + diferencia + "años.");
        } else if (edadHermano2 > edadHermano1) {
            diferencia = edadHermano2 - edadHermano1;
            System.out.println("El segundo Hermano tiene: " + edadHermano2 + "años, y es mayor por: " + diferencia + "años.");

        } else {
            System.out.println("Ambos hermanos tienen la misma edad: " + edadHermano1 + "años");
        }
    }
    
}
