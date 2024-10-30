package Diagramação_Componente_iPhone.iphone;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selcionano musica: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina!");
    }
    
}
