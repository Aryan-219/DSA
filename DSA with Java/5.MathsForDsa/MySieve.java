package MathsForDsa;
public class MySieve {
    public static void main(String[] args) {
        int n = 40;
        int[] arr = new int[n+1];
        System.out.println(arr[0]);
        sieve(n, arr);
        for (int i = 2; i < n; i++) {
            if (arr[i] == 1 || arr[i] ==0) {
                System.out.print(i + " ");
            }
        }
    }

    static void sieve(int n, int[] arr) {
        for(int i = 2;i*i<=n ; i++){
            if(arr[i]==0){
                if(checkPrime(i)){
                    arr[i] = 1;
                    for(int j=i*2;j<=n;j+=i){
                        arr[j]=2;
                    }
                }
            }

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