public abstract class Conta implements ContaInterface{
    
    private static int SEQUANCIAL = 1;
    
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente, int numeroAgencia){
        this.agencia = numeroAgencia;
        this.numeroConta = SEQUANCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns(){
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Valor: " + saldo);
        System.out.println("Cliente : " + cliente.getNome());
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
