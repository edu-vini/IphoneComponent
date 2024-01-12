package com.iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // João quer usar o reprodutor de músicas do Iphone
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        // João quer usar o Iphone como aparelho telefonco
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        // João quer navegar pela internet no Iphone
        iphone.exibirPagina();
        iphone.adicionarNovaPagina();
        iphone.atualizarPagina();

    }
}
