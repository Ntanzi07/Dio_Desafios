// Nossos heróis 
let heroisInfos = {
    0:{
        nome: "Zephyr", 
        idade: 113, 
        tipo: "mago",
        vida: 80
    },
    1:{
        nome: "Phineas", 
        idade: 49, 
        tipo: "guerreiro",
        vida: 130
    },
    2:{
        nome: "Xander", 
        idade: 80, 
        tipo: "monje",
        vida: 100
    },
    3:{
        nome: "Rhys", 
        idade: 20, 
        tipo: "ninja",
        vida: 70
    }
}

class heroi{
    constructor(nome, idade, tipo, vida){
        // Criando as variaveis do objeto
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.vida = vida;
    }

    // Método atacar
    atacar(inimigo){
        // Variavel para definir o tipo do ataque
        let tipoAtaque;
        let dano;
        // Verificando o tipo do ataque referente ao tipo do heroi!
        switch(this.tipo){
            case "mago":
                tipoAtaque = "magia" // se mago -> no ataque exibir (usou magia)
                dano = Math.floor(25 + Math.random() * 10);
                break;
            case "guerreiro":
                tipoAtaque = "espada" // se guerreiro -> no ataque exibir (usou espada)
                dano = Math.floor(15 + Math.random() * 10);
                break;
            case "monje":
                tipoAtaque = "artes marciais" // no ataque exibir (usou artes marciais)
                dano = Math.floor(20 + Math.random() * 10);
                break;
            case "ninja":
                tipoAtaque = "shuriken" // no ataque exibir (usou shuriken)
                dano = Math.floor(30 + Math.random() * 10);
                break;
            default:
                tipoAtaque = "mão" // valor caso o tipo não esteje entre os selecionados
                dano = Math.floor(Math.random() * 10);
        }
        // Atacando!
        console.log(`O ${this.tipo} ${this.nome} atacou ${inimigo} usando ${tipoAtaque} com ${dano} de dano`);
        return dano;
    }

    // Pega a informação da vida
    getVida(){
        return this.vida;
    }
    // Pega a informação do nome
    getNome(){
        return this.nome;
    }
    // Pega a informação do tipo
    getTipo(){
        return this.tipo;
    }

    // Leva o dano :/
    setDano(dano){
        this.vida -= dano;
    }
}

// Função main
function main(heroisInfos){
    // Criando a variaveis
    let valorAleatorio1;
    let valorAleatorio2;
    let dano;

    // Deixando o numero aleatorio;
    do{
        valorAleatorio1 = Math.floor(Math.random() * 4);
        valorAleatorio2 = Math.floor(Math.random() * 4);
    }while(valorAleatorio1 === valorAleatorio2);

    // Instanciando os novos heróis!
    let heroi1 = new heroi(heroisInfos[valorAleatorio1].nome,
        heroisInfos[valorAleatorio1].idade,
        heroisInfos[valorAleatorio1].tipo,
        heroisInfos[valorAleatorio1].vida);

    let heroi2 = new heroi(heroisInfos[valorAleatorio2].nome,
        heroisInfos[valorAleatorio2].idade,
        heroisInfos[valorAleatorio2].tipo,
        heroisInfos[valorAleatorio2].vida);
    
    // Cria o cabeçalho da batalha
    console.log("\n");
    console.log(`Batalha entre: ${heroi1.getTipo()} ${heroi1.getNome()} VS ${heroi2.getTipo()} ${heroi2.getNome()} `);
    console.log("-----------------------------------");
    console.log("Inicio da Batalha!");
    console.log("\n");
    
    // Que comece a luta!!!
    do{
        dano = heroi1.atacar(heroi2.getNome());
        heroi2.setDano(dano);
        dano = heroi2.atacar(heroi1.getNome());
        heroi1.setDano(dano)
        console.log(`-- O ${heroi1.getTipo()} ${heroi1.getNome()} esta com ${heroi1.getVida()} de vida e o ${heroi2.getTipo()} ${heroi2.getNome()} esta com ${heroi2.getVida()}`);
        console.log("\n");
    }while(heroi1.getVida() >= 0 || heroi2.getVida() >= 0);

    console.log("-----------------------------------");
    console.log("Fim da Batalha!!");
    if(heroi1.getVida() > heroi2.getVida())
        console.log(`O ${heroi1.getTipo()} ${heroi1.getNome()} venceu a batalha!!`);
    else if(heroi2.getVida() > heroi1.getVida())
        console.log(`O ${heroi2.getTipo()} ${heroi2.getNome()} venceu a batalha!!`);
    else
        console.log("Ouve o empate entre os Heróis!!")
    
}

main(heroisInfos);