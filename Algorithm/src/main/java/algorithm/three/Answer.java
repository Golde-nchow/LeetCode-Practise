package algorithm.three;

import java.util.HashMap;

/**
 * @author: Kam-Chou
 * @date: 2020/7/4 11:17
 * @description: 第三题答案
 * @version: 1.0
 */
public class Answer {

    public int lengthOfLongestSubstring(String s) {
        int length = s.length(), result = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < length; end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                // start用于专门存储开始位置
                // 这里 +1，是因为，需要从重复字符的后一位开始重新计算.
                start = Math.max(map.get(c) + 1, start);
            }
            // result 存储长度
            result = Math.max(end - start + 1, result);
            map.put(c, end);
        }

        return result;
    }

}
