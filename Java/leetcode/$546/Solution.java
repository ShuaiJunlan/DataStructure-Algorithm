package $546;

import java.util.LinkedList;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:44 2017/5/4.
 */
public class Solution {
    public int point = Integer.MIN_VALUE;
    public int[] isVisit;
    public int removeBoxes(int[] boxes) {
        isVisit = new int[boxes.length];
        dfs(boxes, boxes.length, 0);
        return point;
    }
    public void dfs(int[] boxes, int left, int points){
        if (left == 0) {
            point = point > points ? point : points;
            return;
        }
        for (int i = 0; i < boxes.length;){
            if (isVisit[i] == 1) {
                i++;
                continue;
            }
            int count = 1;
            LinkedList<Integer> list = new LinkedList<>();
            list.push(i);
            isVisit[i] = 1;
            for (int j = i + 1; j < boxes.length; j++){
                if (isVisit[j] == 1)
                    continue;
                if (boxes[j] == boxes[i]){
                    count++;
                    isVisit[j] = 1;
                    list.push(j);
                } else {
                    i = j;
                    break;
                }
            }
            dfs(boxes, left - count, points + count * count);
            while (list.size() != 0)
                isVisit[list.pop()] = 0;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] boxes = {1, 3, 2, 2, 2, 3, 4, 3, 1};
        System.out.println(solution.removeBoxes(boxes));
    }
}
