package MathsForDsa;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(squareRoot(n, p));
    }

    static double squareRoot(int n, int p) {
        int s = 0;
        int e = n;
        double sroot = 0.0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                s = mid + 1;

            } else {
                e = mid - 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (sroot * sroot <= n) {
                sroot = sroot + incr;
            }
            sroot = sroot - incr;
            incr = incr / 10;
        }
        return sroot;
    }
}
