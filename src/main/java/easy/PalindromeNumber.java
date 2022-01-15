package easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        for (int i = 0; i < xStr.length() / 2; i++) {
            if (xStr.charAt(i) != xStr.charAt(xStr.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
