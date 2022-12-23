package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(getFibonacci(i));
        }
    }

    public static int getFibonacci(int fibonacciN) {
        if (fibonacciN == 1) {
            return 0;
        }

        if (fibonacciN == 2) {
            return 1;
        }
        int sum = 0;
        int firstNum = 0;
        int secondNum = 1;


        for (int i = 3; i <= fibonacciN; i++) {
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }

        return sum;
    }
}
