package $165;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:52 PM 2/22/19.
 */
public class Solution {
    public int compareVersion(String version1, String version2){
        assert version1 != null && version2 != null;
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int a = Math.min(v1.length, v2.length);
        for (int  i = 0; i < a; i++){
            int t1 = Integer.valueOf(v1[i]), t2 = Integer.valueOf(v2[i]);
            if (t1 > t2){
                return 1;
            }else if (t1 < t2){
                return -1;
            }
        }
        if (a < v1.length){
            for (int i = a; i < v1.length; i++){
                int t = Integer.valueOf(v1[i]);
                if (t != 0){
                    return 1;
                }
            }
        }
        if (a < v2.length){
            for (int i = a; i < v2.length; i++){
                int t = Integer.valueOf(v2[i]);
                if (t != 0){
                    return -1;
                }
            }
        }
        return 0;
    }
}
