/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;
/**
 *
 * @author ROCIO
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numero = entrada.nextInt();
        if(numero>=0){
            System.out.println("Es positivo");
       
        }else {System.out.println("Es negativo");}
    }
    
}
