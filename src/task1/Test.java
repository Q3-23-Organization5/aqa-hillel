package task1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();

        Random random = new Random();
        for (int i=0; i<100; i++){
            int randomValue = random.nextInt(41)-20;
            integerList.add(randomValue);
        }
        System.out.println("Original Collection:");
        System.out.println(integerList);

        HashSet<Integer> uniqueCollection = new HashSet<>(integerList);
        ArrayList<Integer> collectionWithoutDuplicates = new ArrayList<>(uniqueCollection);

        for (Integer num : integerList) {
            if (uniqueCollection.add(num)) {
                collectionWithoutDuplicates.add(num);
            }
        }

        int duplicates = integerList.size() - collectionWithoutDuplicates.size();

        System.out.println("\nCollection Without Duplicates:");
        System.out.println(collectionWithoutDuplicates);

        System.out.println("\nNumber of Deleted Duplicates: " + duplicates);
    }
}
