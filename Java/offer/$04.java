package com.sh.offer;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:44 2017/1/18.
 * <p>
 * 替换空格为'20%':
 * 方法一：从头到尾遍历字符串，遇到空格就替换，将空格后面的字符串后移两位，时间复杂度为；O(n·2)
 * 方法二：先遍历整个字符串，计算空格的个数和字符串的实际长度，从后向前遍历整个字符串数组，逐个复制字符，时间复杂度为：O(n)
 * 1)判断字符串是否为空，且字符串数组容量大于0
 * 2)计算实际字符的长度('\0'标志字符串的结束)@stringLength，以及空格的长度@blankNum
 * 3)根据stringLength和blankNum，计算替换之后字符串的实际长度为@newStringLength = stringLength + blankNum << 1
 * 4)从后向前遍历字符串数组，替换空格，此时注意a++和++a的优先级问题。
 */
public class $04 {
    /**
     * 替换字符串中的空格
     *
     * @param string 已知字符串
     * @param length 字符串数组的总容量
     */
    public static void replaceBlank(char[] string, int length) {
        if (length != 0 && string != null) {
            int blankNum = 0;           //  记录字符串中空格的数量
            int stringLength = 0;       //  记录字符串的长度
            while (string[stringLength] != '\0')        //  计算字符串实际长度和空格的数量
            {
                if (string[stringLength] == ' ')
                    blankNum++;
                stringLength++;
            }
            int newStringLength = stringLength + (blankNum << 1);   //  计算替换之后字符串数组实际长度
            if (newStringLength > length)
                return;
            while (stringLength > 0 && newStringLength > stringLength)        //  遍历数组，循环条件：'stringLength > 0' 与
            {                                                                   // 'stringLength > 0 && newStringLength > stringLength' 的区别
                stringLength--;
                if (string[stringLength] == ' ')    //  遇到空格执行替换操作，此时注意'[]'与‘++newStringLength’执行顺序！！！
                {
                    string[--newStringLength] = '0';
                    string[--newStringLength] = '2';
                    string[--newStringLength] = '%';
                } else                                //  遇到非空格，执行复制操作
                {
                    string[--newStringLength] = string[stringLength];
                }
            }
        }
    }

    /**
     * 测试函数
     *
     * @param args
     */
    public static void main(String[] args) {
        char[] a = new char[20];
        //  测试一
        a[0] = '1';
        a[1] = ' ';
        a[2] = '3';

        //  测试二

        //  测试三
//        a[0] = ' ';
//        a[1] = ' ';

        replaceBlank(a, 20);
        System.out.println(a);

    }
}
