
public class Main{
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(41234,new Cliente("Hernany","Simão", "788880"), 20520.00, 21000.00);
        Conta conta2 = new ContaCorrente(78890,new Cliente("Mauricio","Simão", "788880"), 65500.00, 900.00);
        Conta conta3 = new ContaPoupanca(90764,new Cliente("Bruno","Simão", "788880"), 1230.00, 200.2100);
        conta3.deposito(48000);
        if(!conta.transferencia(1000.9, conta2)){
            System.out.println(conta2.getNome()+" Valor insuficiente");
        }
        if(!conta2.saque(3000.00)){
            System.out.println(conta2.getNome()+" Valor insuficiente");
        }
        if(!conta.saque(200.00)){
            System.out.println(conta2.getNome()+" Valor insuficiente");
        }
        System.out.println(conta.extrato());
        System.out.println(conta3.extrato());
    }

}