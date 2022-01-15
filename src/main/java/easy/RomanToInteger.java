package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {

        Map<Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        int rsl = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I' && i < s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                rsl -= 1;
            } else if (s.charAt(i) == 'X' && i < s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                rsl -= 10;
            } else if (s.charAt(i) == 'C' && i < s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                rsl -= 100;
            } else {
                rsl += dict.get(s.charAt(i));
            }

        }

        return rsl;

    }

}
