package sort;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:13 AM 3/18/19.
 */
public class ShellSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public void sort(T[] a) {
        if (a == null || a.length == 0) {
            return;
        }
        shellSort(a);
    }

    public void sort(int[] a) {
        for (int gap = (a.length >> 1); gap > 0; gap >>= 1) {
            for (int i = 0; i < gap; i++) {
                //对分组数据进行直接插入排序
                for (int j = i + gap; j < a.length; j = j + gap) {
                    int temp = a[j];
                    int k;
                    for (k = j - gap; k >= 0; k = k - gap) {
                        if (a[k] > temp) {
                            a[k + gap] = a[k];
                        } else {
                            break;
                        }
                    }
                    a[k + gap] = temp;
                }
            }
        }
    }

    private void shellSort(T[] a) {
        for (int gap = (a.length >> 1); gap > 0; gap >>= 1) {
            for (int i = 0; i < gap; i++) {
                //对分组数据进行直接插入排序
                for (int j = i + gap; j < a.length; j = j + gap) {
                    T temp = a[j];
                    int k;
                    for (k = j - gap; k >= 0; k = k - gap) {
                        if (a[k].compareTo(temp) > 0) {
                            a[k + gap] = a[k];
                        } else {
                            break;
                        }
                    }
                    a[k + gap] = temp;
                }
            }
        }
    }
}
