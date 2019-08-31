package alibaba;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String getIndexAndLongest(String users) {
        return String.valueOf(getMaxGirl(users)) +" " + String.valueOf(getMaxBoy(users, 3));
    }
    //bgbbbggbg
    //bgbbbgbggbgbg
    private static int getMaxGirl(String users){
        int boy = 0,preGirl = 0, tempGirl = 0, index = -1, maxGirl = 0, preBoy = 0;
        char[] chars = users.toCharArray();
        for (int i = 0; i < chars.length * 2; i++){
            if (chars[i % chars.length] == 'g'){
                tempGirl++;
            }else if (chars[i % chars.length] == 'b'){
                if (tempGirl + preGirl > maxGirl){
                    maxGirl = tempGirl + preGirl;
                    index = preBoy;
                }
                preGirl = tempGirl;
                tempGirl = 0;
                preBoy = i;
                if (i > chars.length){
                    return index % chars.length;
                }
            }
        }
        return index;
    }
    private static int getMaxBoy(String users, int k){
        int[] boyNum = new int[users.length()];
        int boy = 0, girlCount = 1;
        char[] chars = users.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == 'b'){
                boy++;
            }else {
                boyNum[girlCount] = boy;
                girlCount++;
                boy = 0;
            }
        }
       boyNum[girlCount] = boy;
        if (boyNum[1] == 0){
            boyNum[girlCount] += boyNum[1];
            boyNum[1] = boyNum[girlCount];
        }
        int sum = 0, maxSum = 0;
        for (int i = 1; i <= girlCount - 3; i++){
            if (i % 4 == 0){
                maxSum = Math.max(maxSum, sum);
                sum -= boyNum[i-3];
            }else {
                sum += boyNum[i];
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _users;
        try {
            _users = in.nextLine();
        } catch (Exception e) {
            _users = null;
        }

        res = getIndexAndLongest(_users);
        System.out.println(res);
    }
}
