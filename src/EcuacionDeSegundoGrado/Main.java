/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcuacionDeSegundoGrado;

import modelo.EcuacionDeSegundoGrado;

/**
 *
 * @author Lorena Jimenez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             EcuacionDeSegundoGrado ecuacion_1 = new EcuacionDeSegundoGrado(3,1,-4);
      

       
            System.out.println("Valor de la ecuacion de grado dos: " + ecuacion_1.getDiscriminante());
            System.out.println(" Raices: " + ecuacion_1.getNumeroDeSoluciones());
            System.out.println("caso1: " + ecuacion_1.getRaiz1());
            System.out.println("caso2: " + ecuacion_1.getRaiz2());

        EcuacionDeSegundoGrado ecuacion_2 = new EcuacionDeSegundoGrado(2,-8,-100);
           
            System.out.println("Valor de la ecuacion de grado dos: " + ecuacion_2.getDiscriminante());
            System.out.println("Raices: " + ecuacion_2.getNumeroDeSoluciones());
            System.out.println("caso1: " + ecuacion_2.getRaiz1());
            System.out.println("caso2: " + ecuacion_2.getRaiz2());
        
       EcuacionDeSegundoGrado ecuacion_3 = new EcuacionDeSegundoGrado(2,-3,-5); 
       
            System.out.println("Valor de la ecuacion de grado dos: " + ecuacion_3.getDiscriminante());
            System.out.println("Raices: " + ecuacion_3.getNumeroDeSoluciones());
            System.out.println("caso1: " + ecuacion_3.getRaiz1());
            System.out.println("caso2: " + ecuacion_3.getRaiz2()); 
}
}
    
    

