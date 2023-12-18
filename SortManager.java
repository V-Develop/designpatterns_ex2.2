import java.util.List;

public class SortManager {
    private ISortingAlgorithm sortingAlgorithm;

    public SortManager(ISortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void setSortingAlgorithm(ISortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void performSort(List<Integer> numbers) {
        sortingAlgorithm.sort(numbers);
    }
}
