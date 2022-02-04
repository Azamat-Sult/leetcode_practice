package easy;


public class PlusOne {

    public int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        int index = digits.length - 1;
        digits[index]++;
        while (index > 0 && digits[index] > 9) {
            digits[index] -= 10;
            digits[index - 1]++;
            index--;
        }

        if (digits[0] == 10) {
            int[] temp = digits;
            digits = new int[temp.length + 1];
            digits[0] = 1;
            digits[1] = 0;
            System.arraycopy(temp, 1, digits, 2, temp.length - 1);
        }

        return digits;
    }

}
