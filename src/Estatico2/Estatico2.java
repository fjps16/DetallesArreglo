/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estatico2;

import java.util.Scanner;

/**
 *
 * @author Ray Master Race
 */
public class Estatico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int contarPrimo = 0,contadorpar= 0,contadorimpar=0, sumapares=0, sumarmpares=0,mayorpar=0,menorimpar=9999;         
         Integer Lista[] = new Integer[]{2,4,5,6,8,11,15,16,20,22,50,60,61,80,1};     
         for(int i=0; i < Lista.length; i++){
            if(Lista[i]%2 == 0) {
                 contadorpar++;
                 if(Lista[i] > mayorpar ) {
                     mayorpar = Lista[i];
                 }             
            }else{
                 contadorimpar++;
                 if(Lista[i] < menorimpar) {
                     menorimpar = Lista[i];
                 }                
             }
            if(Lista[i]%2==0){
                 System.out.println("El número "+Lista[i]+" es par");
                 sumapares += Lista[i];                                
            }else{
                 System.out.println("El número "+Lista[i]+" es impar");
                 sumarmpares += Lista[i];                
             }             
            for(int j = 2; j<= Lista.length/2;j++){             
                if((Lista[i]%j)==0) {
                 contarPrimo++;
                 break;
                }                       
            }         
        }
         System.out.println("La cantidad de pares: "+contadorpar);
         System.out.println("La cantidad de impares: "+contadorimpar);
         System.out.println("La suma de todos los pares es: "+sumapares);
         System.out.println("La suma de todos los impares es: "+sumarmpares);
         System.out.println("La cantidad de primos: "+contarPrimo);
         System.out.println("El número mayor par es: "+mayorpar);
         System.out.println("El numero menor impar es: "+menorimpar);
         
         
         
                
    }  
}
    

