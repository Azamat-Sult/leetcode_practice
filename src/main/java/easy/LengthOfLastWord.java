package easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int rsl = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                while (i >= 0 && s.charAt(i) != ' ') {
                    rsl++;
                    i--;
                }
                break;
            }
        }
        return rsl;
    }

}
