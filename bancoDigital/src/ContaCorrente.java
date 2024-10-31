public class ContaCorrente extends Conta{
    
    private static int SEQUANCIAL = 1;

    public ContaCorrente(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numeroConta = SEQUANCIAL + "X";
        SEQUANCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato Conta Corrente ---");
        imprimirInfosComuns();
    }

}
