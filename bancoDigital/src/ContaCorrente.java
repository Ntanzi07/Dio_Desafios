public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, int numeroAgencia) {
        super(cliente, numeroAgencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Conta Corrente ---");
        imprimirInfosComuns();
    }

}
