package br.com.poo;

import java.util.Random;

public class jogoV4 {
    //fazer o personagem  caçar, comer e dormir com a seguinte distribuição
    //caça com probabildiade de 50%
    //dorme com probabilidade 30%
    //come com probabilidade 20%

    public static void main(String[] args) throws Exception {
        var p = new Personagem();
        var gerador = new Random();
         p.nome = "Rorro";
        while(true){
            var oQueFazer = 1 + gerador.nextInt(10); //[0,10)
            switch(oQueFazer){
                case 1:
                    
                    p.cacar();
                    break;
                case 2:
                    p.comer();
                    break;
                case 3:
                    p.dormir();
                    break;
            }
            p.exibirEstado();
            System.out.println("=====================================================================================================");
            Thread.sleep(3000);
        }
    }
}

