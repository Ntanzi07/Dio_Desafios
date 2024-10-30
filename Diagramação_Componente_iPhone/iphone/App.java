package Diagramação_Componente_iPhone.iphone;

public class App {
    public static void main(String[] args){
        
        Iphone iphone = new Iphone();
       
        iphone.selecionarMusica("Hear me Tonight");
        iphone.tocar();
        iphone.pausar();

     
        iphone.ligar("1599239202");
        iphone.atender();
        iphone.iniciarCorreioVoz();

    
        iphone.exibirPagina("www.Iphone.com");
        iphone.adicionarNovaAba() ; 
        iphone.atualizarPagina();

    }
}
