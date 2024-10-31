public abstract class Conta implements ContaInterface{
    
    protected int agencia;
    protected String numeroConta;
    protected double saldo;
    protected static final int AGENCIA_PADRAO = 1;

    public int getAgencia() {
        return agencia;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns(){
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Valor: " + saldo);
    }

    @Override
    public void sacar(double valor){
        saldo -= valor;
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, ContaInterface contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

}
