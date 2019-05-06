package $275;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 11:17 AM 5/6/19.
 */
public class Solution {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0){
            return 0;
        }
        for (int i = 0; i < citations.length; i++){
            if (citations[i] >= citations.length - i){
                return citations.length - i;
            }
        }
        return 0;
    }
}
