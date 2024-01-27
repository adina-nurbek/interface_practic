import java.util.Arrays;

public class StringSort implements  Sort {
    private String [] words;

    public StringSort(String[] words) {
        this.words = words;
    }

    @Override
    public void sort() {
        Arrays.sort(words);

    }
}