package br.com.poo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//getter cria um padrão de retorno de padrão das variáveis, anota a classe com o getter, cria um getter pra cada variável 
//anotacion é o @
// o getter só se aplica a quem está abaixo dela

@Getter 
@Setter 
// @NoArgsConstructor //construtor sem parametro
// @AllArgsConstructor //Com todo os parametros
@Builder 

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
}
