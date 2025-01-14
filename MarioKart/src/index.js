const characters = require('./characters.json');

async function rollDice(){
    return Math.floor(Math.random() * 6) + 1;
}

async function getRandomBlock() {
    let randomBlock = Math.random();
    let block;
    if(randomBlock < 0.33)
        block = 'straight';
    else if(randomBlock < 0.66)
        block = 'curve';
    else
        block = 'combat';

    return block;
}

async function logRollResult(name, dice, atribut, result) {
    console.log(`${name} 🎲 roll a d6: ${dice} + ${atribut} = ${result}`)
}

async function playRaceEngine(character1, character2) {
    for(let round = 1; round <= 5; round++){
        console.log(`🏁 Round ${round}`);
        let block = await getRandomBlock();
        let player1Dice = await rollDice();
        let player2Dice = await rollDice();
        let player1Result = player1Dice + character1.VELOCITY;
        let player2Result = player2Dice + character2.VELOCITY;

        console.log(`The Block is ${block.toUpperCase()}`);
        switch (block) {
            case 'straight':
                await logRollResult(character1.NAME, player1Dice, character1.VELOCITY, player1Result);
                await logRollResult(character2.NAME, player2Dice, character2.VELOCITY, player2Result);

                if(player1Result > player2Result){
                    character1.POINTS++;
                }
                else if(player2Result > player1Result){
                    character2.POINTS++;
                }
                break;

            case 'curve':
                await logRollResult(character1.NAME, player1Dice, character1.MANEUVERABILITY, player1Result);
                await logRollResult(character2.NAME, player2Dice, character2.MANEUVERABILITY, player2Result);

                if(player1Result > player2Result){
                    character1.POINTS++;
                }
                else if(player2Result > player1Result){
                    character2.POINTS++;
                }
                break;

            case 'combat':
                await logRollResult(character1.NAME, player1Dice, character1.POWER, player1Result);
                await logRollResult(character2.NAME, player2Dice, character2.POWER, player2Result);

                if(player1Result < player2Result){
                    character1.POINTS--;
                }
                else if(player2Result < player1Result){
                    character2.POINTS--;
                }
                break;

            default:
                break;
        } 
        character1.POINTS < 0 ? character1.POINTS = 0 : null;
        character2.POINTS < 0 ? character2.POINTS = 0 : null;
        
        console.log(`current ${character1.NAME} points is ${character1.POINTS}`); 
        console.log(`current ${character2.NAME} points is ${character2.POINTS}`); 
        console.log(); 
    }
}

async function finalResult(character1, character2) {
    if(character1.POINTS > character2.POINTS)
        console.log(`\n${character1.NAME} wins!!!!`);
    else if(character1.POINTS < character2.POINTS)
        console.log(`\n${character2.NAME} wins!!!!`);
    else
        console.log(`\nDraw 🤔`);
    
}

(async function  main() {
    const player1 = characters[Math.floor(Math.random() * 6)];
    const player2 = characters[Math.floor(Math.random() * 6)];
    console.log(`🏁🚨 Race between ${player1.NAME} e ${player2.NAME} starting!!\n`);

    await playRaceEngine(player1, player2);
    await finalResult(player1, player2);


})();