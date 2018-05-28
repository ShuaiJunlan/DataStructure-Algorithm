package $069;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 18:28 2018/5/28.
 */
public class Solution {
    public int mySqrt(int x) {
        if (x == 0){
            return 0;
        }
        int start  = 1,end = x;
        while (start + 1 < end){
            int mid = (end - start) / 2 + start;
            if (mid > x / mid){
                end = mid;
            }else {
                start = mid;
            }
        }
        if (end <= x / end) {
            return end;
        }
        return start;
    }
}
