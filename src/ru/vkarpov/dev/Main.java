package ru.vkarpov.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static List<Integer> array = new ArrayList<>(Arrays.asList(1, 3, 5, 10));
    static int sum;

    public static int getSumArray(List<Integer> array){
        if (array.size() == 0)
            return sum;
        sum += array.get(0);
        array.remove(0);
        getSumArray(array);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSumArray(array));
    }


}
