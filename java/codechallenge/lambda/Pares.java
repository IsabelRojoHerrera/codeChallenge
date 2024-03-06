package com.codechallenge.lambda;

//una interfaz funcional es una interfaz que tiene solo un método abstracto. Si puede tener métodos estáticos pero solo 1 abstracto.
@FunctionalInterface
public interface Pares {
    boolean esPar(int numero);
}
