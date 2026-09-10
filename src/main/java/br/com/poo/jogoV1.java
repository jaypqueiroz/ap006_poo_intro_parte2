package br.com.poo;

public class jogoV1 {
    public static void main(String[] args) {
        var p = new Personagem(); //Java 10+
        p.nome = "Dudu";
        p.cacar();
        p.comer();
        p.dormir();
    }
}
