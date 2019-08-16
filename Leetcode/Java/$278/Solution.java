package $278;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:12 AM 8/16/19.
 */
public class Solution {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end){
            int mid = start + (end - start) >> 1;
            if (!isBadVersion(mid)){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return start;
    }


    private boolean isBadVersion(int version){
        return true;
    }
}
