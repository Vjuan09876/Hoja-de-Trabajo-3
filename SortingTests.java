import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortingTests {
    SortingAlgorithms sa = new SortingAlgorithms();
    @Test
    public void testGnomeSort() {
        Integer[] arr = {5, 2, 9, 1};
        Integer[] expected = {1, 2, 5, 9};
        sa.gnomeSort(arr);
        assertArrayEquals(expected, arr);
    }
    @Test
    public void testMergeSort() {
        Integer[] arr = {3, 0, -1, 5};
        Integer[] expected = {-1, 0, 3, 5};
        sa.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }
}