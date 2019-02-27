package $134;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 6:57 PM 2/27/19.
 */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tanks;
        for (int i = 0; i < gas.length; i++){
            tanks = gas[i];
            int j = 1;
            for (; j < gas.length; j++){
                tanks -= cost[(i+j-1)%gas.length];
                if (tanks < 0){
                    break;
                }
                tanks += gas[(i+j)%gas.length];

            }
            if (tanks >= cost[(i + gas.length - 1)%gas.length] && j == gas.length){
                return i;
            }
        }
        return -1;
    }
}
