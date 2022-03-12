/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Hernany
 */
public class Empres {
    
    public static int duasParcelas(){
        return 2;
    }
    
     public static double getDuasParcelas(){
        return 0.3;
    }
    public static int tresParcelas(){
        return 3;
    }
    
     public static double gettresParcelas(){
        return 0.45;
    }
     
     public static void calcula(double valor, double parcelas){
         if(parcelas == 2){
             double valorFinal = valor + (valor * getDuasParcelas());
             System.out.println("Valor final: "+ valorFinal);
         } else if(parcelas == 3){
              double valorFinal = valor + (valor * gettresParcelas());
             System.out.println("Valor final: "+ valorFinal);
         } else{
             System.out.println("Valor nao aceite");
         }
     }
    
}
