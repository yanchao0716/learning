package personal.yanchao.algorithm.array;

/**
 * zhuyanchao  2020-03-06
 */
public class T665_非递减数列 {

    public static void main(String[] args) {
        int[] array = {4, 2, 3};
//        int[] array = {1,2,3,1,2,3};
        boolean result = new T665_非递减数列().checkPossibility(array);
        System.out.println(result);
    }

    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length < 3) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (++count > 1) {
                    break;
                }
                if (i - 1 >= 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return count <= 1;
    }

}
