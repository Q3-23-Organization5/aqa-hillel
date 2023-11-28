package task1;
import java.util.ArrayList;
import java.util.List;

public class RearrangeList {
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

        int X = 3; // Value to compare against

        List<Integer> rearrangedList = rearrangeList(numbers, X);

        System.out.println("Original List: " + numbers);
        System.out.println("Rearranged List: " + rearrangedList);
    }

    public static List<Integer> rearrangeList(List<Integer> list, int X) {
        List<Integer> rearrangedList = new ArrayList<>();
        List<Integer> lesserThanX = new ArrayList<>();
        List<Integer> greaterThanX = new ArrayList();

        for (int num : list) {
            if (num <= X) {
                lesserThanX.add(num);
            } else {
                greaterThanX.add(num);
            }
        }

        rearrangedList.addAll(lesserThanX);
        rearrangedList.addAll(greaterThanX);

        return rearrangedList;
    }
}

