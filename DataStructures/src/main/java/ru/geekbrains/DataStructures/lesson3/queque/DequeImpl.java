package ru.geekbrains.DataStructures.lesson3.queque;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E> {

    public DequeImpl(int maxCapacity) {
        super(maxCapacity);
    }


    @Override
    public boolean insertLeft(E value) {
        if (isFull())
            return false;

        if (head == firstIndex()) {
            head = DEFAULT_HEAD;
        }

        data[--head] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull())
            return false;

        if (tail == lastIndex()) {
            tail = DEFAULT_TAIL;
        }

        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E removeLeft() {
        if (isEmpty())
            return null;

        if (head == data.length) {
            head = DEFAULT_HEAD;
        }

        E value = data[head++];
        size--;
        return value;
    }

    @Override
    public E removeRight() {
        if (isEmpty())
            return null;

        if (tail == data.length) {
            tail = DEFAULT_TAIL;
        }

        E value = data[tail--];
        size--;
        return value;
    }

    public int firstIndex(){
        return head - 1;
    }
}
