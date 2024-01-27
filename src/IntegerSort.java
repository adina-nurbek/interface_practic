import java.util.Arrays;

public class IntegerSort implements  Sort {
    private int[] numbers;

    public IntegerSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void sort() {
        Arrays.sort(numbers);
    }
}
