package $539;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:40 2017/3/14.
 */

/**
 * Problem description:
 * Given a list of 24-hour clock time points in "Hour:Minutes" format, </br>
 * find the minimum minutes difference between any two time points in the list.</br>
 * Test cases: </br>
 * Example 1: </br>
 * Input: ["$23:59","00:00"] </br>
 * Output: 1 </br>
 */
public class Solution {
    public int findMinDifference(List<String> timePoints) {
        String[] start = timePoints.get(0).split(":");
        String[] end = timePoints.get(1).split(":");
        int hours = 24 - Integer.valueOf(start[0]) + Integer.valueOf(end[0]);
        int minutes = Integer.valueOf(start[1]) - Integer.valueOf(end[1]);
        return hours * 60 - minutes;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("21:59");
        list.add("10:10");
        Solution solution = new Solution();
        System.out.println(solution.findMinDifference(list));
    }
}
