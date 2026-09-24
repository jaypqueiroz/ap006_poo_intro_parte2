package br.com.poo;

import java.util.Random;

public class jogoV4 {
/*
Fazer o personagem morrer quando a energia chegar a 0 (zero), fazendo o jogo acaba.
contar o numero de rodadas e exibir ao final;
implementa um placar: quando o personagem caçar, comer ou dormir em uma rodada, ele ganha uma vitória
é contabilizada. quando tentar fazer uma atividade e nao tiver energia, fome ou sono para faze-lo, uma derrota é contabilidade, exibe os numeros
de vitoria e derrota a cada rodada
 */

    public static void main(String[] args) throws Exception {
        var p = new Personagem();
        var gerador = new Random();
         p.nome = "Rorro";
        while(true){
            var oQueFazer = 1 + gerador.nextInt(10); //[0,10)
            if(oQueFazer <= 5){
                p.cacar();
            }
            else if(oQueFazer > 5 && oQueFazer <= 8){
                p.dormir();
            }
            else {
                p.comer();
            }

            p.exibirEstado();
            System.out.println("=====================================================================================================");
            Thread.sleep(3000);
        }
    }
}


