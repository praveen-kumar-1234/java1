//Generics advantages u can know by following program in collections
//By using generics u can write same implementation logic for different types of data
import java.util.*;

class MyCollection<T> {
    private List<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    public T get(int index) {
        return elements.get(index);
    }

    // Added method to print the collection elements
    public void printAll() {
        for (T element : elements) {
            System.out.println(element); // Print each element
        }
    }
}

class StringMemory {

    public static void main(String[] args) {

        // Use MyCollection for different types:
        MyCollection<String> names = new MyCollection<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Print names collection
        System.out.println("Names:");
        names.printAll(); // Use the added method

        MyCollection<Integer> ages = new MyCollection<>();
        ages.add(25);
        ages.add(30);
        ages.add(32);

        // Print ages collection
        System.out.println("Ages:");
        ages.printAll(); // Use the added method
    }
}
