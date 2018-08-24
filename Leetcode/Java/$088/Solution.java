package $088;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:51 2018/5/18.
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>(m + n);
        int i = 0, j = 0;
        while (i < m && j < n){
            if (nums1[i] < nums2[j]){
                list.add(nums1[i]);
                i++;
            }else {
                list.add(nums2[j]);
                j++;
            }
        }
        while (i < m){
            list.add(nums1[i]);
            i++;
        }
        while (j < n){
            list.add(nums2[j]);
            j++;
        }
        for (int p = 0; p < (m+n); p++){
            nums1[p] = list.get(p);
        }
    }
}
