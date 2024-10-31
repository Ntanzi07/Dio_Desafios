import java.util.Scanner;

public class App {
    public static Banco banco = new Banco("BancoTOP", 1023);
    static Scanner scannerString = new Scanner(System.in);
    static Scanner scannerNum = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0;
        do {
            tabelaOpcoes();
            op = scannerNum.nextInt();

            switch (op) {
                case 1:
                    novoCliente();
                    break;
                case 2:
                    operacaoDeConta(1);
                    break;
                case 3:
                    operacaoDeConta(2);
                    break;
                case 4:
                    operacaoDeConta(3);
                    break;
                case 5:
                    banco.listarTodasContas();
                    break;
                default:
                    System.out.println("Opção não existente!!");
                    break;
            }
        } while (op != 0);
    }

    public static void tabelaOpcoes(){
        System.out.println("\nBem vindo ao banco " + banco.getNome());
        System.out.println("---------------------------------");
        System.out.println("Adcionar Conta          [1]");
        System.out.println("Depositar               [2]");
        System.out.println("Sacar                   [3]");
        System.out.println("Trasferir               [4]");
        System.out.println("Listar Contas           [5]");   
        System.out.println("Sair                    [0]");   
    }

    public static void operacaoDeConta(int tipoOperacao){
        int numeroConta;
        int numeroContaPara;
        double valor;

        System.out.println("insira o valor:");
        valor = scannerNum.nextDouble();
        System.out.println("insira o numero da conta:");
        numeroConta = scannerNum.nextInt();

        if(tipoOperacao == 1)
            banco.depositar(numeroConta, valor);
        else if(tipoOperacao == 2)
            banco.sacar(numeroConta, valor);
        else{
            System.out.println("insira o numero da conta para qual vai transferir:");
            numeroContaPara = scannerNum.nextInt();
            banco.transferir(numeroConta, numeroContaPara, valor);
        }
    }

    public static void novoCliente(){
        String nome;
        String cpf;
        int tipoConta;

        System.out.println("Qual o tipo da conta [ Corrente [1] / Poupança [2] ]:");
        tipoConta = scannerNum.nextInt();

        System.out.println("Insira o nome do Cliente:");
        nome = scannerString.nextLine();

        System.out.println("Insira o cpf do Cliente:");
        cpf = scannerString.nextLine();
        
        banco.adicionarConta(tipoConta, nome, cpf);
    }
}
