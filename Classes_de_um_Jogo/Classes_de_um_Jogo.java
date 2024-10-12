package Classes_de_um_Jogo;

import java.util.Scanner;

public class Classes_de_um_Jogo {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumeric = new Scanner(System.in);
        
        // pegando as informações do Heroi!
        System.out.println("digite o nome do Herói:");
        String nome = inputString.nextLine();
        System.out.println("digite a idade do Herói:");
        int idade = inputNumeric.nextInt();
        System.out.println("digite a tipo do Herói [ mago | ninja | guerreiro | monje ]:");
        String tipo = inputString.nextLine();

        //instanciando os novos heróis!
        heroi heroi = new heroi(nome, idade, tipo);
        
        //usando o ataque!
        heroi.atacar();

        inputNumeric.close();
        inputString.close();
    }
}

class heroi{
    private String nome;
    private int idade;
    private String tipo;

    public heroi(String nome, int idade, String tipo){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar(){
        // Variavel para definir o tipo do ataque
        String tipoAtaque;

        // Verificando o tipo do ataque referente ao tipo do heroi!
        switch(this.tipo){
            case "mago":
                tipoAtaque = "magia"; // se mago -> no ataque exibir (usou magia)
                break;
            case "guerreiro":
                tipoAtaque = "espada"; // se guerreiro -> no ataque exibir (usou espada)
                break;
            case "monje":
                tipoAtaque = "artes marciais"; // no ataque exibir (usou artes marciais)
                break;
            case "ninja":
                tipoAtaque = "shuriken"; // no ataque exibir (usou shuriken)
                break;
            default:
                tipoAtaque = "mão"; // valor caso o tipo não esteje entre os selecionados
        }
        // Atacando!
        System.out.println("O " + this.tipo + " " + this.nome +" de " + this.idade + " anos atacou usando " + tipoAtaque);
    }

}
