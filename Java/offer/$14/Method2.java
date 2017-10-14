package $14;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:14 2017/2/7.
 */
public class Method2 {
    public static void reorder(int[] pData, int length, IFunc iFunc) {
        if (pData == null || length <= 0)
            return;
        int begin = 0;
        int end = length - 1;
        while (begin < end) {
            while (begin < end && !iFunc.isEven(pData[begin]))
                begin++;
            while (begin < end && iFunc.isEven(pData[end]))
                end--;
            if (begin < end) {
                int temp = pData[begin];
                pData[begin] = pData[end];
                pData[end] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        reorder(a, a.length, new IsEvenNumber());
        for (int b : a)
            System.out.println(b);
    }
}

interface IFunc {
    boolean isEven(int n);
}

class IsEvenNumber implements IFunc {
    public boolean isEven(int n) {
        return (n & 0x1) == 0;
    }
}
