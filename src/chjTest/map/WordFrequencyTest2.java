package chjTest.map;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] splitList = text.split(" ");

        Map<String, Integer> resultMap = new HashMap<>();
        for (String key : splitList) {
            int count = resultMap.getOrDefault(key, 0);
            resultMap.put(key, ++count);
        }

        System.out.println(resultMap);
    }
}
