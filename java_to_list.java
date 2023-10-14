import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorToList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Convert an iterator to a list
        Iterator<Integer> iterator = list.iterator();
        List<Integer> convertedList = new ArrayList<>();
        while (iterator.hasNext()) {
            convertedList.add(iterator.next());
        }

        System.out.println("Converted List in Java: " + convertedList);
    }
}
