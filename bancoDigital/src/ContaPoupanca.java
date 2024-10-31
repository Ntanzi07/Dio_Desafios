public class ContaPoupanca extends Conta{
   
    private static int SEQUANCIAL = 1;

    public ContaPoupanca(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numeroConta = SEQUANCIAL + "Y";
        SEQUANCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato Conta Poupança ---");
        imprimirInfosComuns();
    }

}
