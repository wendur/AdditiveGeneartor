import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private final int first = 0;
    private final int last = 39;
    private ArrayList<Integer> numbers = new ArrayList<>();
    private int base;

    public Generator(int m) {
        this.base = m;
        fillGenerator();
        System.out.println(numbers);
    }

    private void fillGenerator() {
        Random random = new Random();
        for (int i=0; i<58; i++) {
            numbers.add(random.nextInt(10001));
        }
    }

    public int getNext() {
        int num = (numbers.get(first) + numbers.get(last)) % base;
        numbers.remove(first);
        numbers.add(num);
        return num;
    }
}
