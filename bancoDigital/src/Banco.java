import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private int numeroAgencia;
    private List<Conta> listaContas = new ArrayList<>();

    public Banco(String nome, int numeroAgencia){
        this.nome = nome;
        this.numeroAgencia = numeroAgencia;
    }

    public void adicionarConta(int tipoConta, String nome, String cpf){
        Cliente cliente = new Cliente(nome, cpf);
        Conta conta = null;

        if(tipoConta == 1)
            conta = new ContaCorrente(cliente, numeroAgencia);
        else
            conta = new ContaPoupanca(cliente, numeroAgencia);

        listaContas.add(conta);
    }

    public void listarTodasContas(){
        for(Conta conta : listaContas){
            conta.imprimirExtrato();
        }
    }

    public void sacar(int numeroConta, double valor){
        for(Conta conta : listaContas)
            if(conta.getNumeroConta() == numeroConta)
                conta.sacar(valor);
    }

    public void depositar(int numeroConta, double valor){
        for(Conta conta : listaContas)
            if(conta.getNumeroConta() == numeroConta)
                conta.depositar(valor);
    }

    public void transferir(int numeroConta, int numeroContaTransferir, double valor){
        for(Conta conta : listaContas){
            if(numeroConta == conta.getNumeroConta()){
                
                for(Conta contaPara : listaContas){
                    if(numeroContaTransferir == contaPara.getNumeroConta()){
                        conta.transferir(valor, contaPara);
                    }
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }
}
