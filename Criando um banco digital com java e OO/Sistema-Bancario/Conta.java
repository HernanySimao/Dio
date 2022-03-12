public abstract class Conta {

  private double numeroDeConta;
  private Cliente nome;
  private double saldo;
  private double limite;
  protected double taxa;

  public Conta(double numeroDeConta,
  Cliente nome,
  double saldo,
  double limite){
    this.numeroDeConta =  numeroDeConta;
    this.nome =  nome;
    this.saldo= saldo;
    this.limite = limite;
  }

  public double getNumeroDeConta() {
    return numeroDeConta;
  }

  public void setNumeroDeConta(double numeroDeConta) {
    this.numeroDeConta = numeroDeConta;
  }

  public Cliente getNome() {
    return nome;
  }

  public void setNome(Cliente nome) {
    this.nome = nome;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public String extrato(){
      return getNome() +"\n"+getSaldo()+"\n"+getNumeroDeConta();
  }
  

  public Boolean deposito(double saldo){
    if(saldo > 0){
        setSaldo(getSaldo()+saldo);
        return true;
    }
    return true;
  }

  public Boolean saque(double saldo){
    if(saldo <= getSaldo()){
        setSaldo(getSaldo() - saldo);
        return true;
    }
    return false;
  }

  public Boolean transferencia(double saldo, Conta conta){
    if(saque(saldo)){
        return conta.deposito(saldo);
    }
    return false;
  }

  public abstract void aplicaTaxa(double rendimento);

}
