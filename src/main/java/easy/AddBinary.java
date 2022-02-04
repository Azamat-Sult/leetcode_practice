package easy;

public class AddBinary {

    public String addBinary(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        boolean prev = false;
        StringBuilder rsl = new StringBuilder();
        char charA;
        char charB;
        while (aIndex >= 0 || bIndex >= 0) {
            if (aIndex >= 0) {
                charA = a.charAt(aIndex);
            } else {
                charA = '0';
            }
            if (bIndex >= 0) {
                charB = b.charAt(bIndex);
            } else {
                charB = '0';
            }
            if (charA == '0' && charB == '0' && !prev) {
                rsl.insert(0, "0");
            } else if (charA == '0' && charB == '0' && prev) {
                rsl.insert(0, "1");
                prev = false;
            } else if (charA == '0' && charB == '1' && !prev) {
                rsl.insert(0, "1");
            } else if (charA == '0' && charB == '1' && prev) {
                rsl.insert(0, "0");
                prev = true;
            } else if (charA == '1' && charB == '0' && !prev) {
                rsl.insert(0, "1");
            } else if (charA == '1' && charB == '0' && prev) {
                rsl.insert(0, "0");
                prev = true;
            } else if (charA == '1' && charB == '1' && !prev) {
                rsl.insert(0, "0");
                prev = true;
            } else if (charA == '1' && charB == '1' && prev) {
                rsl.insert(0, "1");
                prev = true;
            }
            aIndex--;
            bIndex--;
        }
        if (prev) {
            rsl.insert(0, "1");
        }
        return rsl.toString();
    }

}