package $071;

import java.util.LinkedList;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:25 AM 2018/08/09.
 */
public class Solution {
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0){
            return path;
        }
        String[] strs = path.split("/");
        LinkedList<String> linkedList = new LinkedList<>();
        for (String str : strs){
            if ("..".equals(str)){
                if (!linkedList.isEmpty()){
                    linkedList.removeLast();
                }
            }else if ((!".".equals(str)) && (!"".equals(str))){
                linkedList.add(str);
            }
        }
        if (linkedList.size() == 0){
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : linkedList){
            stringBuilder.append("/" + str);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.simplifyPath("/home/");
    }
}
