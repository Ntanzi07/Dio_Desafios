public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, int numeroAgencia) {
        super(cliente, numeroAgencia);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Conta Poupança ---");
        imprimirInfosComuns();
    }

}
