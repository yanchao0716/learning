package personal.yanchao.algorithm.array;

import java.util.HashSet;
import java.util.Set;

/**
 * zhuyanchao  2020-03-15
 */
public class T532_数组中的K_diff数对 {

    public int findPairs(int[] nums, int k) {
        if(k < 0){
            return 0;
        }
        Set<Integer> saw = new HashSet<>();
        Set<Integer> diff = new HashSet<>();
        for (int num : nums) {
            if(saw.contains(num - k)){
                diff.add(num - k);
            }
            if(saw.contains(num + k)){
                diff.add(num);
            }
            saw.add(num);
        }
        return diff.size();
    }

}
