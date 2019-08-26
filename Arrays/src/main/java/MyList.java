public interface MyList<E> {

    void add (E value);

    boolean remove (E value);

    boolean remove (int index);

    E get (int index);

    boolean contains(E value);
    int indexOf(E value);

    int size();
    boolean isEmpty();

    void print();

    void sortBubble();
    void sortSelect();
    void sortInsert();
}
