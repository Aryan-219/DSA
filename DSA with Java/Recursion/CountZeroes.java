public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(457040));
        System.out.println(04%10);
        // System.out.println(04053400/10);
    }
    static int count=0;
    static int countZeroes(int n){
        if(n%10==n){
            if(n==0){
                count++;
                return count;
            }
            else{
                return count;
            }
        }
        if(n%10==0){
            count++;
            countZeroes(n/10);
        }else{
            
            countZeroes(n/10);
        }
        return count;
    }
}
