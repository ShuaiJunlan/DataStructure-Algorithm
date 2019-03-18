package sort.test;

import sort.SelectSort;

import java.util.Arrays;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:01 AM 3/18/19.
 */
public class SelectSortTest {
    public static void main(String[] args) {
        SelectSort<Integer> integerInsertSort = new SelectSort<>();
        int[] arr1 = {2,4,6,567,1234,243,123,4,2345,324,4,234,5,2346,657,8765};
        int[] arr2 = {};
        int[] arr3 = {1};
        int[] arr4 = {354,435,26,3546,35,764,567,6,78,6578,5678,5678,5768578,576856785,578567,5768,768,7,8,78888,7787878,7878,7878,785784,12,3,45,8};

        int[] arr1Copy = Arrays.copyOf(arr1, arr1.length);
        integerInsertSort.sort(arr1);
        Arrays.sort(arr1Copy);
        assertArrayEquals(arr1, arr1Copy);

        int[] arr2Copy = Arrays.copyOf(arr2, arr2.length);
        integerInsertSort.sort(arr2);
        Arrays.sort(arr2Copy);
        assertArrayEquals(arr2, arr2Copy);

        int[] arr3Copy = Arrays.copyOf(arr3, arr3.length);
        integerInsertSort.sort(arr3);
        Arrays.sort(arr3Copy);
        assertArrayEquals(arr3, arr3Copy);

        int[] arr4Copy = Arrays.copyOf(arr4, arr4.length);
        integerInsertSort.sort(arr4);
        Arrays.sort(arr4Copy);
        assertArrayEquals(arr4, arr4Copy);

    }

    private static void assertArrayEquals(int[] original, int [] expected){
        assert Arrays.toString(original).equals(Arrays.toString(expected));
    }
}
