package sberfight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pipes {

    public static int getResult(List<String> scheme) {

        int[][] matrix = new int[scheme.size()][scheme.get(0).split("-").length];
        int i = 0;
        for (String str : scheme) {
            String[] split = str.split("-");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(split[j]);
            }
            i++;
        }

        for (i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int sum = 0;
        Map<String, Integer> price = new HashMap<>();
        price.put("000"
                + "110"
                + "010", 10);
        price.put("010"
                + "110"
                + "000", 13);
        price.put("010"
                + "011"
                + "000", 15);
        price.put("000"
                + "011"
                + "010", 17);
        price.put("010"
                + "010"
                + "010", 20);
        price.put("000"
                + "111"
                + "000", 21);
        price.put("010"
                + "111"
                + "000", 29);
        price.put("010"
                + "110"
                + "010", 31);
        price.put("000"
                + "111"
                + "010", 32);
        price.put("010"
                + "011"
                + "010", 40);
        price.put("010"
                + "111"
                + "010", 63);


        for (i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    int[][] pipe = new int[3][3];
                    pipe[1][1] = 1;
                    if (i == 0 || matrix[i - 1][j] == 1) {
                        pipe[0][1] = 1;
                    }
                    if (i == matrix.length - 1 || matrix[i + 1][j] == 1) {
                        pipe[2][1] = 1;
                    }
                    if (j == 0 || matrix[i][j - 1] == 1) {
                        pipe[1][0] = 1;
                    }
                    if (j == matrix[i].length - 1 || matrix[i][j + 1] == 1) {
                        pipe[1][2] = 1;
                    }
                    for (int k = 0; k < pipe.length; k++) {
                        for (int l = 0; l < pipe[k].length; l++) {
                            System.out.print(pipe[k][l] + " ");
                        }
                        System.out.println();
                    }
                    String pipeStr = "";
                    for (int k = 0; k < pipe.length; k++) {
                        for (int l = 0; l < pipe[k].length; l++) {
                            pipeStr += pipe[k][l];
                        }
                    }
                    System.out.println();
                    System.out.println(pipeStr);
                    System.out.println();

                    sum += price.get(pipeStr);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
    }

}