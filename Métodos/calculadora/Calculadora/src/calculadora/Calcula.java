 
package calculadora;
 
public class Calcula {
    
    
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        
    System.out.println("A soma do "+numero1+" e do numero "+numero2+ "é igual "+resultado);
       
    }
    
    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        
    System.out.println("A sub do "+numero1+" e do numero "+numero2+ "é igual "+resultado);
       
    }
    
    public static void multi(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        
    System.out.println("A Mult do "+numero1+" e do numero "+numero2+ "é igual "+resultado);
       
    }
    
    
    public static void div(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        
    System.out.println("A Div do "+numero1+" e do numero "+numero2+ "é igual "+resultado);
       
    }
    
}
