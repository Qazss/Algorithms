package ru.geekbrains.DataStructures.lesson3.queque;


import ru.geekbrains.DataStructures.lesson3.ICollection;

public interface Queue<E> extends ICollection {

    boolean insert(E value);

    E remove();

    E peek();

}
