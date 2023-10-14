import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NumberGenerator {
    public static void main(String[] args) {
        // Using an array to generate numbers
        List<Integer> arrayNumbers = generateNumbersArray();
        
        // Using a linked list to generate numbers
        List<Integer> linkedListNumbers = generateNumbersLinkedList();

        // Comparing the two approaches
        System.out.println("Array Numbers:");
        for (Integer num : arrayNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nLinkedList Numbers:");
        for (Integer num : linkedListNumbers) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> generateNumbersArray() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static List<Integer> generateNumbersLinkedList() {
        List<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
