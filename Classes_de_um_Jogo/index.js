class heroi{
    constructor(nome, idade, tipo){
        // Criando as variaveis do objeto
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // Método atacar
    atacar(){
        // Variavel para definir o tipo do ataque
        let tipoAtaque;

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
        console.log(`O ${this.tipo} ${this.nome} atacou usando ${tipoAtaque}`);
    }


}

// função main
function main(){

    //instanciando os novos heróis!
    let mago = new heroi("Zephyr", 113, "mago");
    let guerreiro = new heroi("Phineas", 49, "guerreiro");
    let monje = new heroi("Xander", 80, "monje");
    let ninja = new heroi("Rhys", 20, "ninja");

    //usando o ataque!
    mago.atacar();
    guerreiro.atacar();
    monje.atacar();
    ninja.atacar();

}

main()