public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(4321));
        
    }
    static int sum=0;
    static int reverse(int n){
        if(n%10==n){
            return sum*10+n;
        }
        int rem= n%10;
        sum= sum*10 +rem;
        return reverse(n/10);
    }
}
