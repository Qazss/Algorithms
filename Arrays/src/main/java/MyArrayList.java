import java.util.Arrays;

public class MyArrayList<E extends Object & Comparable<? super E>> implements MyList<E>{

    private static final int DEFAULT_CAPACITY = 16;

    protected E[] array;
    protected int size;

    public MyArrayList (){
        array = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList (int capacity){
        array = (E[]) new Object[capacity];
    }

    protected void checkSize(){
        if(size == array.length){
            array = extendedArray();
        }
    }

    protected E[] extendedArray(){
        return Arrays.copyOf(array, array.length * 2);
    }

    @Override
    public void add(E value) {
        if(value == null){
            throw new RuntimeException("Значение не может быть пустым");
        }
        checkSize();
        array[size++] = value;
    }

    @Override
    public boolean remove(E value) {
        return remove(indexOf(value));
    }

    @Override
    public boolean remove(int index) {
        if (index >= 0 && index < size){
            for (int i = index; i < size - 1; i++){
                array[i] = array[i + 1];
            }
            array[--size] = null;
            return true;
        }
        return false;
    }

    @Override
    public E get(int index) {
        if(index >= 0 && index < size){
            return array[index];
        }
        return null;
    }

    @Override
    public boolean contains(E value) {
        return false;
    }

    @Override
    public int indexOf(E value) {
        if(value != null) {
            for (int i = 0; i < size; i++) {
                array[i].equals(value);
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void print() {
        System.out.print("[ ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    @Override
    public void sortBubble() {
        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - 1 - i; j++){
                if(array[j].compareTo(array[j+1]) > 0){
                    change(j, j+1);
                }
            }
        }
    }

    private void change(int index1, int index2){
        E temp = array[index1];
        array[index1] = array[index2];
        array[index2]  = temp;
    }

    @Override
    public void sortSelect() {
        for(int i = 0; i < size; i++){
            int min = i;
            for(int j = i + 1; j < size; j++){
                if(array[j].compareTo(array[min]) < 0){
                    min = j;
                }
            }
            change(min, i);
        }

    }

    @Override
    public void sortInsert() {
        for(int i = 0; i < size; i++){
            E temp = array[i];
            int in = i;
            while (in > 0 && array[in - 1].compareTo(temp) >= 0){
                array[in] = array[in - 1];
                in--;
            }
            array[in] = temp;
        }
    }
}
