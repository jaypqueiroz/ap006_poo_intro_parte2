package br.com.poo;

public class jogoV5 {
    public static void main (String[] args);
        var p1 = new Personagem(); //10, 0 , 0
        var p2 = new Personagem(5, 10, 2);
        System.out.printf("%s\n", p1.toString());
        System.out.println(p2);
        System.out.println("Energia do P2: " + p2.getEnergia);
        
}