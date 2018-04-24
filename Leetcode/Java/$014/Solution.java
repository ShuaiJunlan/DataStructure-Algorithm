package $014;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:07 2018/3/15.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0){
            return "";
        }
        String targetStr =  strs[0];
        for (int i = 1; i < strs.length; i++){
            if ("".equals(strs[i])){
                return "";
            }
            while (strs[i].indexOf(targetStr) != 0){
                if (targetStr.length() <= 1){
                    return "";
                }
                targetStr = targetStr.substring(0, targetStr.length()-1);
            }
        }
//        String targetStr =  "";
//        for(String str : strs){
//            if ("".equals(str)){
//                return "";
//            }
//            if ("".equals(targetStr)){
//                targetStr = str;
//                continue;
//            }
//            while (str.indexOf(targetStr) != 0){
//                if (targetStr.length() <= 1){
//                    return "";
//                }
//                targetStr = targetStr.substring(0, targetStr.length()-1);
//            }
//        }
        return targetStr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr ={"112", "1122", "1133"};
        System.out.println(solution.longestCommonPrefix(arr));
    }
}
