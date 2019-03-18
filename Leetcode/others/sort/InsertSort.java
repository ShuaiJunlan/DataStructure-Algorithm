package sort;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 11:21 AM 3/18/19.
 */
public class InsertSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public void sort(T[] a) {
        if (a == null || a.length <= 1){
            return;
        }
        for (int i = 1; i < a.length; i++){
            T current = a[i];
            int j = i-1;
            for (; j >= 0; j--){
                if (a[j].compareTo(current) > 0){
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = current;
        }
    }
}
