package br.com.poo;

public class Personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    void cacar(){
        if(energia >= 2){
            System.out.printf("%s caçando...\n", nome);
            energia -= 2; // energia = energia - 2
        }
        else{
            System.out.printf("%s sem energia para caçar...\n", nome);
        }
        if (fome < 10)
            fome ++;
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        if(fome >= 1){
            System.out.printf("%s comendo...\n", nome);
            fome--;
            energia = energia < 10 ? energia + 1 : energia;
        }else{
            System.out.printf("%s sem fome...\n", nome); 
        }
    }

    void dormir (){
        if(sono >= 1){
            System.out.println(nome + " dormindo...");
            sono--;
            energia = energia < 1 ? energia + 10 : energia;
        }
        else{
            System.out.printf("%s sem sono...\n", nome);
        }
    }
    
    void exibirEstado(){
        System.out.printf("nome: %s, energia: %d, fome: %d, sono: %d\n", nome, energia, fome, sono);
    }
}
