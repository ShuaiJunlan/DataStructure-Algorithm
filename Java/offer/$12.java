package com.sh.offer;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:20 2017/2/6.
 */
public class $12 {
    /**
     * method1 start
     */
    public static void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;

        char number[] = new char[n];
        for (int i = 0; i < n; i++) {
            number[i] = '0';
        }
        while (!increment(number)) {
            printNumber(number);
        }
    }

    /**
     * 数字递增
     *
     * @param number
     * @return
     */
    public static boolean increment(char[] number) {
        boolean isOverflow = false;
        int nTakeOver = 0;
        for (int i = number.length - 1; i >= 0; i--) {
            int temp = number[i] - '0' + nTakeOver;
            if (i == number.length - 1)
                temp++;
            if (temp >= 10) {
                if (i == 0)
                    isOverflow = true;
                else {
                    nTakeOver = 1;
                    temp -= 10;
                    number[i] = (char) ('0' + temp);
                }
            } else {
                number[i] = (char) ('0' + temp);
                break;
            }

        }
        return isOverflow;
    }

    /**
     * 打印数字
     *
     * @param number
     */
    public static void printNumber(char[] number) {
        boolean isBeginning0 = true;
        for (int i = 0; i < number.length; i++) {
            if (isBeginning0 && number[i] != '0')
                isBeginning0 = false;
            if (!isBeginning0)
                System.out.print(number[i]);
        }
        System.out.println();
    }
    // method1 end


    //  method2 start
    public static void print1ToMaxOfNDigits_2(int n) {
        if (n <= 0)
            return;
        char number[] = new char[n];
        for (int i = 0; i < 10; i++) {
            number[0] = (char) (i + '0');
            print1ToMaxOfNDigitsRecursively(number, n, 0);
        }
    }

    public static void print1ToMaxOfNDigitsRecursively(char[] number, int length, int index) {
        if (index == length - 1) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[index + 1] = (char) (i + '0');
            print1ToMaxOfNDigitsRecursively(number, length, index + 1);
        }
    }

    public static void main(String[] args) {
//        char number[] = new char[10];
//        for (int i = 0; i < number.length; i++)
//        {
//            System.out.println(number[i]);
//        }
//        print1ToMaxOfNDigits(3);
        print1ToMaxOfNDigits_2(2);
    }
}
