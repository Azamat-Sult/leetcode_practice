package easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        int shortestStrLength = strs[0].length();
        for (String str : strs) {
            if (str.length() < shortestStrLength) {
                shortestStrLength = str.length();
            }
        }

        if (shortestStrLength == 0) {
            return "";
        }

        String rsl = "";

        for (int i = 0; i < shortestStrLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j - 1].charAt(i) != strs[j].charAt(i)) {
                    return rsl;
                }
            }
            rsl = rsl + strs[0].charAt(i);
        }

        return rsl;
    }

}