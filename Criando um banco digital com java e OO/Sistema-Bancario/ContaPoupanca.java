public class ContaPoupanca extends Conta {

    public ContaPoupanca(double numeroDeConta, Cliente nome, double saldo, double limite) {
        super(numeroDeConta, nome, saldo, limite);
    }

    @Override
    public void aplicaTaxa(double rendimento) {
        taxa = rendimento * 3;
    }
    
}
