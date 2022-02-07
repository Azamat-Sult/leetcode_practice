package sberfight;

import java.util.List;

public class Rockets {

    public static int getResult(List<Integer> rocketPos, List<Integer> rocketSpeed) {

        int rocketCount = 0;

        int[] pos = new int[rocketPos.size()];
        int[] speed = new int[rocketSpeed.size()];

        for (int i = 0; i < rocketPos.size(); i++) {
            pos[i] = rocketPos.get(i);
            speed[i] = rocketSpeed.get(i);
        }

        int minTimeToJoin = 0;

        while (minTimeToJoin != Integer.MAX_VALUE) {
            minTimeToJoin = Integer.MAX_VALUE;
            for (int i = 0; i < pos.length - 1; i++) {
                for (int j = i + 1; j < pos.length; j++) {
                    if (pos[i] != -1 && pos[i] == pos[j]) {
                        pos[i] = -1;
                        speed[j] += speed[i];
                        speed[i] = -1;
                    }
                }
            }
            for (int i = 0; i < pos.length - 1; i++) {
                if (pos[i] != -1) {
                    for (int j = i + 1; j < pos.length; j++) {
                        if (speed[i] != speed[j] && (pos[j] - pos[i]) % (speed[i] - speed[j]) == 0
                                && (pos[j] - pos[i]) / (speed[i] - speed[j]) < minTimeToJoin
                                && (pos[j] - pos[i]) / (speed[i] - speed[j]) > 0) {
                            minTimeToJoin = (pos[j] - pos[i]) / (speed[i] - speed[j]);
                        }
                    }
                }

            }
            if (minTimeToJoin != Integer.MAX_VALUE) {
                for (int i = 0; i < pos.length; i++) {
                    if (pos[i] != -1) {
                        pos[i] += minTimeToJoin * speed[i];
                    }
                }
            } else {
                for (int i = 0; i < pos.length; i++) {
                    if (pos[i] != -1) {
                        rocketCount++;
                    }
                }
            }

        }

        System.out.println(rocketCount);
        return rocketCount;
    }

}