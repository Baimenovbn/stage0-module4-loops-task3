package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        final int MULTIPLIER = 9;
        int sum = 0;
        int current = 0;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            current += Math.pow(10, i);
            sum += (current * MULTIPLIER);
        }

        System.out.println(sum);
    }
}
