package task2;

import java.util.ArrayList;
import java.util.List;

public class Xlist {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);
        numbers.add(5);
        numbers.add(6);
        numbers.add(10);
        numbers.add(2);
        numbers.add(9);

        int X = 5; // Value to compare against

        List<Integer> newList = newList(numbers, X);

        System.out.println("Original List: " + numbers);
        System.out.println("Rearranged List: " + newList);
    }
    public static List<Integer> newList(List<Integer> list, int X) {
        List<Integer> newList = new ArrayList<>();
        List<Integer> lessThanX = new ArrayList<>();
        List<Integer> greaterThanX = new ArrayList();

        for (int num : list) {
            if (num <= X) {
                lessThanX.add(num);
            } else {
                greaterThanX.add(num);
            }
        }

        newList.addAll(lessThanX);
        newList.addAll(greaterThanX);

        return newList;
    }
}
