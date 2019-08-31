package xinlang;

public class Solution1 {
    public String getMinVersion(String[] list) {
        if (list == null || list.length == 0){
            return null;
        }
        String minVersion = list[0];
        for (String s : list){
            if (compare(minVersion, s)){
                minVersion = s;
            }
        }
        // 在这里编写代码
        return minVersion;
    }
    private boolean compare(String s1, String s2){
        String[] nums1 = s1.split("\\.");
        String[] nums2 = s2.split("\\.");
        int i = 0;
        while (i < nums1.length && i < nums2.length){
            int temp1 = Integer.valueOf(nums1[i]), temp2 = Integer.valueOf(nums2[i]);
            if (temp1 > temp2){
                return true;
            }else if (Integer.valueOf(nums1[i]) < Integer.valueOf(nums2[i])){
                return false;
            }
            i++;
        }
        if (i < nums1.length){
            return true;
        }
        if (i < nums2.length){
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.compare("3", "3.4"));
        System.out.println(solution1.compare("3.4.5", "3.4"));
        System.out.println(solution1.compare("3.5", "3.4"));
    }
}
