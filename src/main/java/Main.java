import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int N = 100;
        int M = 10;
        Generator gen = new Generator(M);

        List<Integer> lst1 = new ArrayList<>();
        List<Float> lst2 = new ArrayList<>();

        int tempNum;
        for (int i=0; i<N; i++) {
            tempNum = gen.getNext();
            lst1.add(tempNum);
            lst2.add((float)tempNum/M);
        }

        System.out.println("Мат. ожидание: " + getExpectedValue(lst1, N));
        System.out.println("Дисперсия: " + getDispersion(lst1, N, getExpectedValue(lst1, N)));
    }
    /*
    public static float getEntropy() {

        return
    }*/

    public static float getExpectedValue(List<Integer> list, int N) {
        int value = 0;
        for (Integer i : list) {
            value += i;
        }
        return (float) value / N;
    }

    public static float getDispersion(List<Integer> list, int N, float M) {
        int value = 0;
        for (Integer i : list) {
            value += Math.pow(i-M, 2);
        }
        return (float) value / N;
    }

    /*
    def entropy(labels: list) -> float:
    """ Вычисление энтропии вектора из 0-1 """
    n_labels = len(labels)

    if n_labels <= 1:
        return 0

    counts = np.bincount(labels)
    probs = counts[np.nonzero(counts)] / n_labels
    n_classes = len(probs)

    if n_classes <= 1:
        return 0
    return - np.sum(probs * np.log(probs)) / np.log(n_classes)

     */
}
