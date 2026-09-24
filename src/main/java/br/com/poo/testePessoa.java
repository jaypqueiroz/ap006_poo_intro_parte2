package br.com.poo;

public class testePessoa {
    public static void main (String [] args){
        var p = 
            Pessoa
            .builder()
            .nome("Ana")
            .idade(18)
            .build();
        var p2 = 
            Pessoa
            .builder()
            .nome("Joaquim")
            .build();
        // p.setIdade(18);
        // p.setNome("Ana");
        // p.setPeso("80");
    }
}
//método builder devolve um builder e o build devolve a pessoa