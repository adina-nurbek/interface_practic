import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Adina", "Madina", "Sultanali"};
        Sort stringSort = new StringSort(strings);
        stringSort.sort();

        System.out.println("Отсортированный" + Arrays.toString(strings));

        int[] numbers = {99, 82, 58, 1, 9};
        Sort integerSort = new IntegerSort(numbers);
        integerSort.sort();

        System.out.println("Отсортированный" + Arrays.toString(numbers));

    }
}
