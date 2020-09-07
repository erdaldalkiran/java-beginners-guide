import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SynchronizedDemo {
    public static void main(final String[] args) throws InterruptedException {

         var t1 = new Summer("nombre 1", Arrays.asList(1, 2, 3));
         var t2 = new Summer("nombre 2",  Arrays.asList(4, 5, 6));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

class Globals{
    static int sum = 0;
    static final Object ciko = new Object();
    static final Function<List<Integer>, Integer> sumInt = (final List<Integer> numbers) -> {
        synchronized (ciko) {
            for (final int val : numbers) {
                sum += val;
            }
            return sum;
        }
    };
}

class Summer extends Thread {
    private List<Integer> numbers;

    Summer(String name, List<Integer> numbers) {
        super(name);
        this.numbers = numbers;
    }

    @Override
    public void run() {
        Globals.sum = 0;
        final var res = Globals.sumInt.apply(numbers);
        System.out.println("" + Thread.currentThread().getName() + " result: " + res);
    }
}