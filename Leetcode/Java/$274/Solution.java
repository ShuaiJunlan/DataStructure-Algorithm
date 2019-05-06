package $274;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:51 AM 5/6/19.
 */
public class Solution {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0){
            return 0;
        }
        int[] buckets = new int[citations.length + 1];

        for (int a : citations){
            if (a >= citations.length){
                buckets[citations.length]++;
            }else {
                buckets[a]++;
            }
        }
        int count = 0;
        for (int i = citations.length; i >= 0; i--){
            count += buckets[i];
            if (count >= i){
                return i;
            }
        }
        return 0;
    }
}
