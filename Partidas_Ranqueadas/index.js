main();

function main() {
    let randomVitorias;
    let randomDerrotas;
    
    for(let i = 0; i < 3; i ++){
        // Gera numeros aleatorios de vitorias e derrotas
        randomInt = Math.floor(Math.random() * 200);
        randomDerrotas = Math.floor(Math.random() * 200);

        // Usando as funçoes, faz o calculo da saldo e decobre em qual elo nosso heroi está
        let seuSaldo = saldo(randomInt, randomDerrotas);
        let seuRank = rank(seuSaldo);

        console.log("O Herói numero " + (i + 1) + " tem de saldo de " + seuSaldo + " está no nível de " + seuRank);
    }
}

function saldo(vitorias, derrotas){
    let saldo = vitorias - derrotas; // Calculo de saldo (vitórias - derrotas)

    // Se o saldo for negativo transforma ele em 0
    if(saldo < 0)
        saldo = 0; // Nosso Herói não conseguiu...
    return saldo;
}

function rank(saldo){
    let rank;

    if(saldo <= 10)  // Se vitórias for menor do que 10 = Ferro
        rank = "Ferro";
    else if(saldo <= 20)  // Se vitórias for entre 11 e 20 = Bronze
        rank = "Bronze";
    else if(saldo <= 50)
        rank = "Prata";  // Se vitórias for entre 21 e 50 = Prata
    else if(saldo <= 80)
        rank = "Ouro"  // Se vitórias for entre 51 e 80 = Ouro
    else if(saldo <= 90)
        rank = "Diamante"  // Se vitórias for entre 81 e 90 = Diamante
    else if(saldo <= 100)
        rank = "Lendario"  // Se vitórias for entre 91 e 100= Lendário
    else
        rank = "Imortal" // Se vitórias for maior ou igual a 101 = Imortal

    return rank
}