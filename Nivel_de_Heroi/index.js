// Cria as variaveis de nome e nivel
let nome = "Nathan";
let xp = 0;
let nivel;

// Soma xp aleatorio para nosso Herói
for(let i = 0; i < 6; i++){
    xp += Math.floor(Math.random() * 2000);
}

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

console.log("O Herói de nome " + nome + " está com " + xp +" de Xp no nivel de " + nivel);