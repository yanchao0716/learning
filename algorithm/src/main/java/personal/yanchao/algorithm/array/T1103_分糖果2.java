package personal.yanchao.algorithm.array;

import java.util.Arrays;

/**
 * zhuyanchao  2020-03-05
 */
public class T1103_分糖果2 {

    public static void main(String[] args) {
        int[] ans = new T1103_分糖果2().distributeCandies(10, 3);
        System.out.println(Arrays.toString(ans));
    }

    /**
     * 暴力解法
     * 时间复杂度：O(max(根candies，num_people)
     * 空间复杂度：O(1)
     * @param candies
     * @param num_people
     * @return
     */
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int time = 0;
        while (candies > 0) {
            int expectCount = time + 1;
            int actualCount = candies >= expectCount ? expectCount : candies;
            ans[time++ % num_people] += actualCount;
            candies -= actualCount;
        }
        return ans;
    }
}
