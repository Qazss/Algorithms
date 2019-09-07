package ru.geekbrains.DataStructures.lesson3.HomeWork;


import ru.geekbrains.DataStructures.lesson3.stack.Stack;
import ru.geekbrains.DataStructures.lesson3.stack.StackImpl;


public class InvertReader {
    private Stack<Character> stack;
    private int size;

    public InvertReader(String text){
        this.size = text.length();

        if(size > 0) {
            stack = new StackImpl<>(text.length());

            for (int index = 0; index < text.length(); index++) {
                stack.push(text.charAt(index));
            }
        }
    }

    public String getInvertText(){
        char[] resultArr = new char[size];

        int i = 0;
        while (!stack.isEmpty()){
            resultArr[i] = stack.pop();
            i++;
        }
        return new String(resultArr);
    }
}
