package chjTest.map;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] splitList = text.split(" ");

        Map<String, Integer> resultMap = new HashMap<>();
        for (String key : splitList) {
            if (resultMap.containsKey(key)) {
                int value = resultMap.get(key);
                resultMap.put(key, ++value);
            } else {
                resultMap.put(key, 1);
            }
        }

        System.out.println(resultMap);
    }
}
