package lesson5;

import java.util.HashSet;

public class RucksackTask {
    private static int rucksackCapacity;
    private static int size;
    private static Thing[] things;
    private static HashSet<String> resultSet;

    public static void main(String[] args) {
        rucksackCapacity = 6;
        resultSet = new HashSet<>();

        Thing book = new Thing("книга", 1, 600);
        Thing binocular = new Thing("бинокль", 2, 5000);
        Thing medKit = new Thing("аптечка", 4, 1500);
        Thing laptop = new Thing("ноутбук", 2, 40000);
        Thing kettle = new Thing("котелок", 1, 500);

        things = new Thing[]{book, binocular, medKit, laptop, kettle};
        size = things.length;

        getSolution(size);

        for(String s: resultSet){
            System.out.println(s);
        }
    }

    public static void getSolution(int size){
        for(int i = 0; i < size; i++){
            getSolution(size - 1);
            if(size == 2){
                addToResultSet();
            }
            rotate(size);
        }
    }

    public static void rotate(int newSize){
        int pos = size - newSize;
        Thing temp = things[pos];

        int i;
        for(i = pos + 1; i < size; i++){
            things[i-1] = things[i];
        }
        things[i-1] = temp;
    }

//    public static void print(){
//        int sum = 0;
//        int weight = 0;
//        for(int i = 0; i < size; i++){
//            if(weight + things[i].getWeight() <= rucksackCapacity) {
//                sum += things[i].getPrice();
//                weight += things[i].getWeight();
//                System.out.print(things[i].getName() + " ");
//            } else {
//                break;
//            }
//        }
//        System.out.print(" | TOTAL: weight - " + weight + " sum - " + sum);
//        System.out.println("");
//    }


    public static void addToResultSet(){
        int sum = 0;
        int weight = 0;
        String result = "";
        for(int i = 0; i < size; i++){
            if(weight + things[i].getWeight() <= rucksackCapacity) {
                sum += things[i].getPrice();
                weight += things[i].getWeight();
                result += things[i].getName() + " ";
            } else {
                break;
            }
        }
        result += " | TOTAL: weight - " + weight + " sum - " + sum;
        resultSet.add(result);
    }

}

class Thing{
    private  String name;
    private int weight;
    private int price;

    public Thing(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }
}
