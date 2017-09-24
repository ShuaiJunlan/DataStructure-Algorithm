package com.sh.leetcoder.$374;

import java.util.Scanner;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:08 2017/3/30.
 */
public class Solution {
    public static int n;
    public static int pick;

    public int guess(int num) {
        if (pick == num)
            return 0;
        else if (pick < num) {
            return 1;
        } else
            return -1;
    }

    public static int re = 0;

    public int guessNumber(int n) {
        guessN(n, 1);
        return re;
    }

    public void guessN(int n, int a) {
        if (n >= a) {
            if (guess(a + (n - a) / 2) == -1) {
                guessN(n, a + (n - a) / 2 + 1);
            } else if (guess(a + (n - a) / 2) == 1) {
                guessN(a + (n - a) / 2 - 1, a);
            } else {
                re = a + (n - a) / 2;
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        pick = scanner.nextInt();
        Solution solution = new Solution();
        solution.guessNumber(n);
        System.out.println(re);
        System.out.println(2126753390
                + 1702766719);
    }
}
