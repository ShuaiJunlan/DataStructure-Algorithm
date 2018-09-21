package $120;

import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:59 AM 2018/09/21.
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangles){
        if (triangles == null || triangles.isEmpty()){
            return 0;
        }
        for (int i = triangles.size() - 2; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                int self = triangles.get(i).get(j);
                int min = Math.min(triangles.get(i+1).get(j) + self, triangles.get(i+1).get(j+1) + self);
                triangles.get(i).set(j, min);
            }
        }
        return triangles.get(0).get(0);
    }
}
