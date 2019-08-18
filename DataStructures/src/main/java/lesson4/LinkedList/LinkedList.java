package lesson4.LinkedList;

import ru.geekbrains.DataStructures.lesson3.ICollection;

import java.util.function.Consumer;

public interface LinkedList<E> extends ICollection, Iterable<E> {

    void insertFirst(E value);

    E removeFirst();

    boolean remove(E value);

    boolean contains(E value);

    void display();

    E getFirstValue();


    class Entry<T> {
        public final T value;
        public Entry<T> next;

        public Entry(T value) {
            this.value = value;
        }
    }
}