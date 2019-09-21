package wangyi.solution4;

public class Main1 {

    public static int Kendalltaodist_merge(int[] a, int[] b) {//归并版计算
        if (a.length == b.length) {
            int[] test = new int[a.length];
            int[] aux = new int[a.length];
            int[] temp = new int[a.length];
            for (int i = 0; i < temp.length; i++) {//数组的逆数组
                temp[a[i]] = i;
            }
            for (int i = 0; i < temp.length; i++) {
                //b[0]对应的元素在b[]中是0，在a[]中是temp[b[0]],由此得出一个可以直接使用表征两个数组位置关系的数组test
                test[i] = temp[b[i]];
            }
            return count_merge(test, aux, 0, a.length - 1);
        }

        throw new IllegalArgumentException(
                "a.length is not equal with b.length");

    }

    public static int Kendalltaodist_insertion(int[] a, int[] b) {//插入排序版
        if (a.length == b.length) {
            int[] test = new int[a.length];
            int[] temp = new int[a.length];
            for (int i = 0; i < temp.length; i++) {
                temp[a[i]] = i;
            }
            for (int i = 0; i < temp.length; i++) {
                test[i]=temp[b[i]];
            }
            return count_insertion(test);
        }
        throw new IllegalArgumentException("a.length is not equal with b.length");

    }

    private static int count_merge(int[] src, int[] aux, int lo, int hi) {
        if (lo >= hi)
            return 0;
        int inversion = 0;
        int mid = (lo + hi) / 2;
        inversion += count_merge(src, aux, lo, mid);
        inversion += count_merge(src, aux, mid + 1, hi);
        inversion += merge(src, aux, lo, mid, hi);
        return inversion;
    }

    private static int merge(int[] src, int[] aux, int lo, int mid, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            aux[i] = src[i];
        }
        int i = lo;
        int j = mid + 1;
        int k = lo;
        while (k <= hi) {
            if (i > mid)
                src[k++] = aux[j++];
            else if (j > hi)
                src[k++] = aux[i++];
            else if (aux[j] < aux[i]) {
                src[k++] = aux[j++];
                count += (mid + 1 - i);
                //是所以使用mid+1-i是因为放在i前面的总是mid+1的位置上的数字，
                //例如2301-0231(此时1在mid+1的位置上类似于插入排序依次交换位置)
            } else {
                src[k++] = aux[i++];
            }
        }
        return count;
    }

    private static int count_insertion(int[] a){
        int count=0;
        for (int i = 1; i < a.length; i++) {
            while(i>=1 && a[i]<a[i-1]){
                count++;
                int temp=a[i];
                a[i]=a[i-1];
                a[--i]=temp;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Kendalltaodist_insertion(new int[] { 3, 1, 2, 0, 4 },
                new int[] { 1, 0, 2, 4, 3 }));
    }

}
