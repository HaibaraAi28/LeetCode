package com.fcd.leetcode.interview;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 *
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 *
 * 回文串不一定是字典当中的单词。
 *
 * 输入："tactcoa"
 * 输出：true（排列有"tacocat"、"atcocta"，等等）
 *
 * @author fcd
 * @date 2020/9/2 16:27
 * @version 1.0
 */
public class interview_01_04_回文排列 {
    public boolean canPermutePalindrome(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }

        return set.size() < 2;
    }
}
