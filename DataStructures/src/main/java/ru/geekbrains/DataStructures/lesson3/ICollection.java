package ru.geekbrains.DataStructures.lesson3;

public interface ICollection {

    boolean isEmpty();

    int size();

    default boolean isFull() {
        return false;
    }
}
