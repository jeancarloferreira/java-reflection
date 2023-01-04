package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Field;

import br.com.alura.alurator.playground.modelo.Produto;

public class TesteManipulaAtributos {

  public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
    Object produto = new Produto("Produto 1", 20.0, "Marca 1");
    Class<?> classe = produto.getClass();

    System.out.println(classe.getField("id"));

    for(Field atributo : classe.getDeclaredFields()) {
      atributo.setAccessible(true);
      System.out.println(atributo.getName() + ": " + atributo.get(produto));
    }
  }

}

