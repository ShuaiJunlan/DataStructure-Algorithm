package $134;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:43 PM 2/27/19.
 */
public class Solution_Optimize {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, total = 0, tank = 0;
        //if car fails at 'start', record the next station
        for (int i = 0; i < gas.length; i++) {
            if ((tank = tank + gas[i] - cost[i]) < 0) {
                start = i + 1;
                total += tank;
                tank = 0;
            }
        }
        return (total + tank < 0) ? -1 : start;
    }
}
