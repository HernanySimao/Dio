package calculadora;

public class SMS {
    
    
    public static void obterSms(int time) {
         switch(time){
             case 5:
             case 6:
             case 7:
             case 8:
             case 9:
             case 10:
             case 11:
             case 12:
                 bomdia();
                 break;
                 
             case 13:
             case 14:
             case 15:
             case 16:
             case 17:
                 boaTarde();
                 break;
                 
             case 18:
             case 19:
             case 20:
             case 21:
             case 22:
             case 23:
             case 0:
             case 1:
             case 2:
             case 3:
             case 4:
                 boaNoite();
                 break;
                 
             default:
                 System.out.println("Hora invalida");
         }
    }
    
    public static String bomdia(){
        return "Bom dia";
    }
    
     public static String boaTarde(){
        return "Boa tarde";
    }
     
      public static String boaNoite(){
        return "Boa noite";
    }
    
}
