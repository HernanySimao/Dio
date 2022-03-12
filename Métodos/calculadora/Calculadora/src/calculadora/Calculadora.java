
package calculadora;


public class Calculadora {

   
    public static void main(String[] args) {
        

      // Exercicio calculadora
      Calcula.soma(1,2);
      Calcula.subtracao(1,2);
      Calcula.multi(1,2);
      Calcula.div(1,2);
      
      
      // Exercicio SMS
      SMS.obterSms(10);
      SMS.obterSms(13);
      SMS.obterSms(23);
      
      // Exercicio Imprestimo
      Empres.calcula(1000, Empres.getDuasParcelas());
       Empres.calcula(1000, Empres.gettresParcelas());
         Empres.calcula(1000, 5);
 
    }
    
}
