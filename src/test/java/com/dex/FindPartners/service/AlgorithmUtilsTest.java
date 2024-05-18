package com.dex.FindPartners.service;

import com.dex.FindPartners.utils.AlgorithmUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 算法工具类测试
 *
 * @author lanhaohu
 */
public class AlgorithmUtilsTest {


    @Test
    void test() {
        String str1 = "lanhaohu今天学习";
        String str2 = "lanhaohu今天摆烂";
        String str3 = "负责人 [duxia](https://github.com/lanhaohu)";
        String str4 = "lanhaohu今天学习没摆烂";
        // 1
        int score1 = AlgorithmUtils.minDistance(str1, str2);
        // 3
        int score2 = AlgorithmUtils.minDistance(str1, str4);
        System.out.println(score1);
        System.out.println(score2);
    }

    @Test
    void testCompareTags() {
        List<String> tagList1 = Arrays.asList("Java", "大一", "男");
        List<String> tagList2 = Arrays.asList("Java", "大一", "女");
        List<String> tagList3 = Arrays.asList("Python", "大二", "女");
        // 1
        int score1 = AlgorithmUtils.minDistance(tagList1, tagList2);
        // 3
        int score2 = AlgorithmUtils.minDistance(tagList1, tagList3);
        System.out.println(score1);
        System.out.println(score2);
    }

}
