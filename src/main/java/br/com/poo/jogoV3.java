package br.com.poo;
import java.util.Random;
public class jogoV3 {
    public static void main(String[] args)throws Exception {
        var p = new Personagem();
        var gerador = new Random();
        p.nome = "Rorro";
        while(true){
            var oQueFazer = 1 + gerador.nextInt(5); //[0, 5)
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

