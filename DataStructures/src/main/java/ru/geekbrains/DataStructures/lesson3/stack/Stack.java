package ru.geekbrains.DataStructures.lesson3.stack;


import ru.geekbrains.DataStructures.lesson3.ICollection;

public interface Stack<E> extends ICollection {

    void push(E value);

    E pop();

    E peek();

}