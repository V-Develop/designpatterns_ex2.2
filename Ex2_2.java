import java.util.List;
import java.util.Arrays;
public class Ex2_2 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 5, 3, 2, 1);
        SortManager sortManager = new SortManager(new SelectionSort());
        sortManager.performSort(numbers);

        sortManager.setSortingAlgorithm(new MergeSort());
        sortManager.performSort(numbers);

        sortManager.setSortingAlgorithm(new InsertionSort());
        sortManager.performSort(numbers);
    }
}