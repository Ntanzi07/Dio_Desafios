public class App {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(2000.4);
        cp.depositar(100.5);
        cc.transferir(200, cp);
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
