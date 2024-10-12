package Nivel_de_Heroi;

import java.util.Scanner;

public class nivel_de_Heroi {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumeric = new Scanner(System.in);

        // Cria as variaveis de nome e nivel
        System.out.println("Digite o nome do seu Herói:");
        String nome = inputString.nextLine();
        System.out.println("Digite seu xp:");
        int xp = inputNumeric.nextInt();
        String nivel;

        // Faz as verificação de nivel
        if(xp <= 1000)
            nivel = "Ferro"; // Se XP for menor do que 1.000 = Ferro
        else if(xp <= 2000)
            nivel = "Bronze"; // Se XP for entre 1.001 e 2.000 = Bronze
        else if(xp <= 5000)
            nivel = "Prata"; // Se XP for entre 2.001 e 5.000 = Prata
        else if(xp <= 7000)
            nivel = "Ouro"; // Se XP for entre 5.001 e 7.000 = Ouro
        else if(xp <= 8000)
            nivel = "Platina"; // Se XP for entre 7.001 e 8.000 = Platina
        else if(xp <= 9000)
            nivel = "Ascendente"; // Se XP for entre 8.001 e 9.000 = Ascendente
        else if(xp <= 10000)
            nivel = "Imortal"; // Se XP for entre 9.001 e 10.000= Imortal
        else
            nivel = "Radiante"; // Se XP for maior ou igual a 10.001 = Radiante

        System.out.println("O Herói de nome " + nome + " está com " + xp +" de Xp no nivel de " + nivel);

        inputString.close();
        inputNumeric.close(); 
    }
}
