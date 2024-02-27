/*Ex:(java 8 Streams)How to apply streams on arrays
Ans:By using static method Stream.of()


 */

import java.util.*;
        import java.util.stream.*;
        import java.util.function.*;
public class StreamExample {

    public static void main(String[] args) {
//        ArrayList<Integer> l = new ArrayList<>();
//        l.add(10);
//        l.add(0);
//        l.add(15);
//        l.add(5);
//        l.add(20);
//        Integer[] i = l.stream().toArray(Integer[]::new);
//        Stream.of(i).forEach(System.out::println);


        List<Character> c = Arrays.asList('a','b','c');
        Character[] a = c.stream().toArray(Character[]::new);
       // Iterator<Character> itr = Arrays.stream(a).iterator();
        Iterator<Character> itr = Stream.of(a).iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }

}