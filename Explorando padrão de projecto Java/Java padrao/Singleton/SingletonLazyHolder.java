package Singleton;

public class SingletonLazyHolder {

    private static class InstaceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstaceHolder.instancia;
    }
    
}
