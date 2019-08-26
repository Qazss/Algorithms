package lesson5;

public class NumberInvolute {

    public static void main(String[] args) {
        int a = involute(4, 4);
        System.out.println(a);
    }

    public static int involute(int number, int degree){
        if(degree == 1)
            return number;

         return number * involute(number, degree - 1);
    }
}
