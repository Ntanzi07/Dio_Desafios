package Partidas_Ranqueadas;

import java.util.Scanner;

class tools{
    public static int calculaSaldo(int vitorias, int derrotas){
        // Calculo de saldo (vitórias - derrotas)
        int result = vitorias - derrotas;

        if(result < 0)
            return 0; // Nosso Herói não conseguiu...
        else
            return result; // retorna o saldo...
    }

    public static String calculaRank(int saldo){
        String rank;

        if(saldo <= 10)  // Se vitórias for menor do que 10 = Ferro
        rank = "Ferro";
        else if(saldo <= 20)  // Se vitórias for entre 11 e 20 = Bronze
            rank = "Bronze";
        else if(saldo <= 50)
            rank = "Prata";  // Se vitórias for entre 21 e 50 = Prata
        else if(saldo <= 80)
            rank = "Ouro"; // Se vitórias for entre 51 e 80 = Ouro
        else if(saldo <= 90)
            rank = "Diamante";  // Se vitórias for entre 81 e 90 = Diamante
        else if(saldo <= 100)
            rank = "Lendario";  // Se vitórias for entre 91 e 100= Lendário
        else
            rank = "Imortal"; // Se vitórias for maior ou igual a 101 = Imortal

        return rank;
    }
}

public class partidas_ranqueadas {

    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // Pergunta e pega as informações de vitorias
        System.out.println("qual a quantidade de vitorias ?");
        int vitorias = input.nextInt();

        // Pergunta e pega as informações de derrotas
        System.out.println("qual a quantidade de derrotas ?");
        int derrotas = input.nextInt();

        // Usando as funçoes, faz o calculo da saldo e decobre em qual elo nosso heroi está
        int saldoPartidas = tools.calculaSaldo(vitorias, derrotas);
        String seuRank = tools.calculaRank(saldoPartidas);
        
        // Devolve as informações ao usuario!!!
        System.out.println("O Herói tem de saldo de " + saldoPartidas + " está no nível de " + seuRank);

    }
}