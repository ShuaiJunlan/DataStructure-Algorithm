package sort;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:49 AM 3/18/19.
 */
public class SelectSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public void sort(T[] a) {
        insertSort(a);
    }

    public void sort(int[] a){
        if (a == null || a.length == 0){
            return;
        }
        for (int i = 0; i < a.length; i++){
            int minIndex = i;
            for (int j = i; j < a.length; j++){
                if (a[j]< a[minIndex]){
                    minIndex = j;
                }
            }

            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }

    private void insertSort(T[] a){
        if (a == null || a.length == 0){
            return;
        }
        for (int i = 0; i < a.length; i++){
            int minIndex = i;
            for (int j = i; j < a.length; j++){
                if (a[j].compareTo(a[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(a, i, minIndex);
        }
    }

    private void swap(T[] a, int i, int j){
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private void assertArratNotEmpty(){

    }
}
