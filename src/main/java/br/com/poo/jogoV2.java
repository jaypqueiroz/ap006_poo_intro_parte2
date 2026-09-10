package br.com.poo;

public class jogoV2 {
    public static void main(String[] args) throws Exception {
        var p = new Personagem();
        p.nome = "te";
        while(true){
            p.cacar();
            p.exibirEstado();

            p.comer();
            p.exibirEstado();

            p.dormir();
            p.exibirEstado();
            System.out.println("===================================================================");
            Thread.sleep(2000);
        }
    }
}
