import java.util.Arrays;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        int[] a = { 4, 2, 4, 6, 1 };
        int[] b = { 2, 1, 8, 5 };
        int x = 10;
        System.out.println(twoStacks(x, a, b));
        
    }

    public static int twoStacks(int x, int[] a, int[] b) {
        return twoStacks(x, a, b, 0, 0) - 1;
    }

    static int twoStacks(int x, int[] a, int[] b, int sumSoFar, int count) {
        if (sumSoFar > x) {
            return count;
        }
        if (a.length == 0 && b.length == 0) {
            return count;
        }
        int left = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sumSoFar + a[0], count+1);
        int right = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sumSoFar + b[0], count+1);
        return Math.max(left, right);
    }
}