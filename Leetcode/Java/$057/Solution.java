package $057;

import datastruc.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:49 AM 2018/07/19.
 */
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        int n = intervals.size();
        int[] starts = new int[n], ends = new int[n];
        int i = 0;
        for (Interval interval : intervals){
            starts[i] = interval.start;
            ends[i] = interval.end;
            i++;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        List<Interval> list = new ArrayList<>();
        // j is start of interval.
        int j;
        for (i = 0, j = 0; i < n; i++) {
            if (i == n - 1 || starts[i + 1] > ends[i]) {
                list.add(new Interval(starts[j], ends[i]));
                j = i + 1;
            }
        }
        return list;
    }
}
