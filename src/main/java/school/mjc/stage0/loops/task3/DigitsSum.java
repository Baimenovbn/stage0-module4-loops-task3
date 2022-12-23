package school.mjc.stage0.loops.task3;

public class DigitsSum {
//    656 563 345
    public void printDigitsSum(int t){
        String tString = t + "";
        double sum = 0;
        int decimalPower = tString.length() - 1;
        double maxDivider = Math.pow(10, decimalPower);

        for (int i = 0; i < tString.length(); i++) {
            int currentNum = (int) (t / maxDivider);

            sum += currentNum;
            t -= (currentNum * maxDivider);
            decimalPower--;
            maxDivider = Math.pow(10, decimalPower);
        }

        System.out.println((int) Math.abs(sum));
    }
}
