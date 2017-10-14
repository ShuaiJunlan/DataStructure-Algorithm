package $14;


/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:50 2017/2/7.
 */
public class Method1 {
    public static void reorder(int[] pData, int length) {
        if (pData == null || length <= 0)
            return;
        int begin = 0;
        int end = length - 1;
        while (begin < end) {
            while (begin < end && (pData[begin] & 0x1) != 0)
                begin++;
            while (begin < end && (pData[end] & 0x1) == 0)
                end--;
            if (begin < end) {
                int temp = pData[begin];
                pData[begin] = pData[end];
                pData[end] = temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("测试一");
        int[] a = {1, 2, 3, 4, 5, 6};
        reorder(a, a.length);
        for (int b : a)
            System.out.println(b);
        System.out.println("测试一结束");
    }
}
