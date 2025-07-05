package com.desafio.iphone;

import com.desafio.iphone.modelo.Iphone;
import com.desafio.iphone.interfaces.ReprodutorMusical;
import com.desafio.iphone.interfaces.AparelhoTelefonico;
import com.desafio.iphone.interfaces.NavegadorInternet;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        System.out.println("--- Testando Reprodutor Musical ---");
        meuIphone.selecionarMusica("Stairway to Heaven - Led Zeppelin");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuIphone.ligar("9999-8888");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- Testando Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        System.out.println("\n--- Demonstrando Polimorfismo ---");
        ReprodutorMusical player = meuIphone;
        player.tocar();

        AparelhoTelefonico telefone = meuIphone;
        telefone.ligar("1111-2222");

        NavegadorInternet navegador = meuIphone;
        navegador.exibirPagina("https://github.com/heitorwick"); // Funciona

    }
}