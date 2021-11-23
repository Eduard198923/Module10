package homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class MixedElement {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        Stream<Integer> stream2 = Arrays.stream(new Integer[]{9,10,11,12,13});
        Stream<Integer> newStream = zip(stream1, stream2);
        newStream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        final Iterator<T> iteratorFirst = first.iterator();
        final Iterator<T> iteratorSecond = second.iterator();
        ArrayList<T> arrayList = new ArrayList<T>();


        while (iteratorFirst.hasNext()&&iteratorSecond.hasNext()) {
            arrayList.add(iteratorFirst.next());
            arrayList.add(iteratorSecond.next());
        }
        return arrayList.stream();
    }
}
