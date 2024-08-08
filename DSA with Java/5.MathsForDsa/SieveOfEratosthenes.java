package MathsForDsa;
class SieveOfEratosthenes{
    public static void main(String[] args) {
        int n=40;
        boolean[] arr=new boolean[n+1];
        sieveOfEratosthenes(n,arr);
        for(int i=2;i<n;i++){
            if(arr[i]==false){
                System.out.print(i+" ");
            }
        }
    }
    static void sieveOfEratosthenes(int n, boolean[] arr){
        for(int i=2;i*i<=n ; i++){
            if(arr[i]==false){
               if(checkPrime(i)) {

                for(int j=i*2;j<=n;j+=i){
                    arr[j]=true;
                }
               }
            }
        }
        
    }
    static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n ; i++){
            
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}