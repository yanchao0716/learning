package personal.yanchao.algorithm.array;

/**
 * zhuyanchao  2020-03-12
 */
public class T914_卡牌分组 {

    public static void main(String[] args) {
//        int[] deck = {1,2,3,4,4,3,2,1};
//        int[] deck = {1,1,1,2,2,2,3,3};
//        int[] deck = {1};
//        int[] deck = {1,1};
//        int[] deck = {1,1,2,2,2,2};
        int[] deck = {1,1,1,2,2,2,3,3};
        boolean flag = new T914_卡牌分组().hasGroupsSizeX(deck);
        System.out.println(flag);
    }

    public boolean hasGroupsSizeX(int[] deck) {
        int maxNum = 0;
        int maxCount = 0;
        int[] counter = new int[10000];
        for (int i : deck) {
            maxNum = Math.max(i, maxNum);
            maxCount = Math.max(++counter[i], maxCount);
        }
        int groupSize = 2;
        while (groupSize <= maxCount){
            if(maxCount % groupSize != 0){
                groupSize++;
                continue;
            }
            boolean flag = true;
            for (int i = 0; i < counter.length && i <= maxCount; i++) {
                if(counter[i] % groupSize != 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
            groupSize++;
        }
        return false;
    }

}
