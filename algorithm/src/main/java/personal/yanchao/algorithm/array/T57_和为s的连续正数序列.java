package personal.yanchao.algorithm.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * zhuyanchao  2020-03-06
 */
public class T57_和为s的连续正数序列 {
    public static void main(String[] args) {
        int[][] arrays = new T57_和为s的连续正数序列().findContinuousSequence(9);
        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }


    /**
     * 左右指针移动查找
     * 时间复杂度:O(n)
     * 空间复杂度:O(1)
     *
     * @param target
     * @return
     */
    public int[][] findContinuousSequence(int target) {
        int left = 1;
        int right = 0;
        int sum = 0;
        List<int[]> list = new ArrayList<>();
        while (left <= target / 2) {
            if (sum < target) {
                sum += ++right;
            } else if(sum > target) {
                sum -= left++;
            }else {
                int[] array = new int[right - left + 1];
                for (int i = 0; i < array.length; i++) {
                    array[i] = left + i;
                }
                list.add(array);
                sum -= left++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
