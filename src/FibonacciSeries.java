public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibo_topDown(4));
        System.out.println(fibo_bottomUp(4));
    }

    // Memoization
    private static int fibo_topDown(int n) {
        // base case
        if(n == 2) {
            return 1;
        }
        // base case
        if(n == 1) {
            return 0;
        }
        // recursive case
        return fibo_topDown(n-1) + fibo_topDown(n-2);
    }

    // Tabulation
    private static int fibo_bottomUp(int n) {
        int[] series = new int[100];
        series[1] = 1;

        for(int i=2; i< n; i++) {
            series[i] += series[i-1] + series[i-2];
        }
        return series[n-1];
    }
}
