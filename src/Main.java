import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> evenPositiveArray = new ArrayList<>();
        List<Integer> evenArray = new ArrayList<>();
        for (int a: array) {
            if (a > 0) {
                if (a%2==0) {
                    evenPositiveArray.add(a);
                }
            }
        }
        Collections.sort(evenPositiveArray);
        System.out.printf(evenPositiveArray.toString());
    }
}

