public class ContaCorrente extends Conta{
    public ContaCorrente(double numeroDeConta, Cliente nome, double saldo, double limite) {
        super(numeroDeConta, nome, saldo, limite);
    }
    
    @Override
    public Boolean saque(double saldo) {
        return super.saque(saldo-0.10);
    }

    @Override
    public void aplicaTaxa(double rendimento) {
        taxa = rendimento * 2;
    }
}
