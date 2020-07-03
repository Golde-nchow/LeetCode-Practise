package algorithm.one;

import java.util.HashMap;

/**
 * @author: Kam-Chou
 * @date: 2020/6/30 13:08
 * @description: 答案
 * @version: 1.0
 */
public class Answer {

    /**
     * 暴力破解法
     * 两个for循环，一个个比较
     */
    public int[] answer1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 用空间换时间（HashMap）
     */
    public int[] answer2(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(8);
        for (int i = 0; i < nums.length; i++) {
            Integer key = hashMap.get(nums[i]);
            if (key != null) {
                return new int[]{key, i};
            } else {
                hashMap.put(target - nums[i], i);
            }
        }

        return nums;
    }

}
