package $210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:49 PM 2/27/19.
 */
public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites){
        int[][] matrix = new int[numCourses][numCourses]; // i -> j
        int[] indegree = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            int ready = prerequisites[i][0];
            int pre = prerequisites[i][1];
            if (matrix[pre][ready] == 0) {
                indegree[ready]++; //duplicate case
            }
            matrix[pre][ready] = 1;
        }

        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
                temp.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for (int i = 0; i < numCourses; i++) {
                if (matrix[course][i] != 0) {
                    if (--indegree[i] == 0) {
                        queue.offer(i);
                        temp.add(i);
                    }
                }
            }
        }
        int[] re = new int[temp.size()];
        int i = 0;
        for (Integer a : temp){
            re[i++] = a;
        }
        return count != numCourses ? new int[0] : re;
    }
}
