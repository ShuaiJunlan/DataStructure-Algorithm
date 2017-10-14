package $29;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:20 2017/3/1.
 */

import com.sh.basicalgorithm.sort.quicksort.QuickSort;

/**
 * 数组中出现次数超过一半的数字
 */
public class $29 {
    /**
     * 检查某数值在数组中的出现次数是否超过数组长度的一半。
     *
     * @param array 数组
     * @param value 数值
     * @return 返回boolean类型，如果为true则表示出现次数超过一半，</br>
     * 若为false则表示该数值的次数没有超过数组唱的一半
     */
    private boolean checkNumMoreThanHalf(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                count++;
        }
        if (count <= array.length / 2)
            return false;
        return true;
    }

    /**
     * 方法一：</br>
     * 根据快速排序算法的原理，当某个数的出现的次数超过数组长度的一半，</br>
     * 那么数组排序之后中间的数字肯定是该出现一半的数字。
     *
     * @param array  数组
     * @param length 数组长度
     * @return 返回出现次数超过一半的数值，若不存在则返回0
     */
    public int moreThanHalfNum(int[] array, int length) {
        QuickSort q = new QuickSort();
        int start = 0;
        if (array == null || length <= 0)
            return 0;
        int index = q.partition(array, start, array.length - 1);
        while (index != length / 2) {
            if (index < length / 2) {
                index = q.partition(array, index + 1, array.length - 1);
            } else {
                index = q.partition(array, start, index - 1);
            }
        }
        if (!checkNumMoreThanHalf(array, array[index]))
            return 0;
        return array[index];
    }

    /**
     * 方法二：</br>
     * 开始遍历数组，令第一个数字的出现的次数为1，</br>
     * 若数字与遍历的数字相同，则加1，若不相同则减1，</br>
     * 若次数减为0，则重置num，直到遍历完数组，最后的num值为出现次数最多的值。
     *
     * @param array  数组
     * @param length 数组的长度
     * @return 返回出现次数超过一半的数值，若不存在则返回0
     */
    public int moreThanHalfNum1(int[] array, int length) {
        if (array == null || length <= 0)
            return 0;
        int times = 1;
        int num = array[0];
        for (int i = 1; i < length; i++) {
            if (times == 0) {
                num = array[i];
                times = 1;
            } else if (array[i] == num) {
                times++;
            } else {
                times--;
            }
        }
        if (!checkNumMoreThanHalf(array, num))
            return 0;
        return num;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 13, 5, 6, 2, 2, 2};
        $29 a = new $29();
        System.out.println(a.moreThanHalfNum1(array, array.length));
    }

}
