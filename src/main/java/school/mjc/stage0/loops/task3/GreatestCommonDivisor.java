package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0 || second == 0) {
            System.out.println(Math.max(first, second));
            return;
        }

        int min = Math.min(first, second);
        int GCD = 2;

        for (int divider = GCD; divider <= min; divider++) {
            if (first % divider == 0 && second % divider == 0) {
                GCD = divider;
            }
        }
        System.out.println(GCD);
    }
}
