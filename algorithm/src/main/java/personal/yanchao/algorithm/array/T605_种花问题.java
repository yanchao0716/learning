package personal.yanchao.algorithm.array;

import java.util.Arrays;

/**
 * zhuyanchao  2020-03-10
 */
public class T605_种花问题 {

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean flag = new T605_种花问题().canPlaceFlowers(flowerbed, n);
        System.out.println(flag);
        System.out.println(Arrays.toString(flowerbed));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n == 0;
    }

}
