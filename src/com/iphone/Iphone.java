package com.iphone;

import com.iphone.funcionalidades.AparelhoTelefonico;
import com.iphone.funcionalidades.NavegadorInternet;
import com.iphone.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private int modelo;

    @Override
    public void ligar() {
        System.out.println("Ligando do Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo do Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz do Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página do Navegador do Iphone");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando página no Navegador do Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página do Navegador do Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música no Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música no Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecinando Música no Iphone");
    }

    public void setModelo(int modelo){
        this.modelo = modelo;
    }

    public int getModelo(){
        return modelo;
    }
}
