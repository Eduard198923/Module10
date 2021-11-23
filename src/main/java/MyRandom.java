package homework10;

import java.util.stream.Stream;

public class MyRandom {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = pow(2, 48);
        long seed = System.currentTimeMillis();
        Stream<Long> random = myRandom(a, c, m, seed);
        random.limit(10).forEach(System.out::println);
    }

    public static long pow(int value, int powValue) {
        if (powValue == 1) {
            return (long) value;
        } else {
            return (long) (value * pow(value, powValue - 1));
        }
    }

    private static Stream<Long> myRandom(long a, long c, long m, long seed){
        Stream<Long> iterate = Stream.iterate(seed, x -> (a * x + c) % m);
        return iterate;
    }


}
