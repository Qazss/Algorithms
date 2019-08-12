import java.util.Arrays;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        MyArrayList<Integer> list1 = new MyArrayList<Integer>();
        MyArrayList<Integer> list2 = new MyArrayList<Integer>();
        MyArrayList<Integer> list3 = new MyArrayList<Integer>();

        for(int i = 0; i < 1000000; i++){
            int number = (int) Math.round(Math.random() * 1000);
            list1.add(number);
            list2.add(number);
            list3.add(number);
        }

        Date start1 = new Date();
        list1.sortBubble();
        System.out.println("Сортировка пузырьком: " + (new Date().getTime() - start1.getTime()));

        Date start2 = new Date();
        list2.sortSelect();
        System.out.println("Сортировка выборкой: " + (new Date().getTime() - start2.getTime()));

        Date start3 = new Date();
        list3.sortInsert();
        System.out.println("Сортировка вставкой: " + (new Date().getTime() - start3.getTime()));


    }
}
