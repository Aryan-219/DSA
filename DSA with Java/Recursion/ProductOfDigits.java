public class ProductOfDigits {
    
    public static void main(String[] args) {
        System.out.println(productOfDigits(4302));
    }
    static int productOfDigits(int n){
        if(n%10==n){
            return n;
        }
        // Both the base conditions are correct
        // if(n==0){
        //     return 1;
        // }
        return n%10 * productOfDigits(n/10);
    }
}
