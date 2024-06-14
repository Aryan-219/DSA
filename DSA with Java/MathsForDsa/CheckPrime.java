package MathsForDsa;

public class CheckPrime {
    public static void main(String[] args) {
        int x=40;
        for (int i = 1; i <= x; i++) {
           System.out.println(i + "isprime: "+checkPrime(i)); 
        }
    }

    static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
