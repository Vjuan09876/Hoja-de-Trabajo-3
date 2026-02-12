import org.junit.Test;
import static org.junit.Assert.*;

public class SortingAlgorithmsTest {

    private SortingAlgorithms sa = new SortingAlgorithms();

    private Integer[] unsorted() {
        return new Integer[]{5, 3, 8, 1, 9, 2};
    }

    private Integer[] sorted() {
        return new Integer[]{1, 2, 3, 5, 8, 9};
    }

    @Test
    public void gnomeSortShouldSortArray() {
        Integer[] arr = unsorted();
        sa.gnomeSort(arr);
        assertArrayEquals(sorted(), arr);
    }

    @Test
    public void mergeSortShouldSortArray() {
        Integer[] arr = unsorted();
        sa.mergeSort(arr);
        assertArrayEquals(sorted(), arr);
    }

    @Test
    public void quickSortShouldSortArray() {
        Integer[] arr = unsorted();
        sa.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(sorted(), arr);
    }

    @Test
    public void radixSortShouldSortArray() {
        Integer[] arr = unsorted();
        sa.radixSort(arr);
        assertArrayEquals(sorted(), arr);
    }

    @Test
    public void heapSortShouldSortArray() {
        Integer[] arr = unsorted();
        sa.heapSort(arr);
        assertArrayEquals(sorted(), arr);
    }

    @Test
    public void sortingShouldHandleEmptyArray() {
        Integer[] arr = new Integer[]{};
        sa.mergeSort(arr);
        assertArrayEquals(new Integer[]{}, arr);
    }

    @Test
    public void sortingShouldHandleSingleElement() {
        Integer[] arr = new Integer[]{42};
        sa.mergeSort(arr);
        assertArrayEquals(new Integer[]{42}, arr);
    }
}
