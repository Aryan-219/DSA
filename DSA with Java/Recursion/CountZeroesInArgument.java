public class CountZeroesInArgument {
    public static void main(String[] args) {
        int x = 402300;
        System.out.println(count(x));
    }
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n, int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,count+1);
        }else{
            return helper(n/10,count);

        }
    }
}
