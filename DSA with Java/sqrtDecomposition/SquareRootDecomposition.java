import java.util.Scanner;
public class SquareRootDecomposition {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        // System.out.print("Enter the length of array: ");
        // int n = sr.nextInt();
        int[] arr= {1,3,5,2,7,6,3,1,4,8};
        // int[] arr = new int[n];
        // System.out.println("Enter the elements of array:");
        // for(int i=0; i<n; i++){
        //     arr[i] = sr.nextInt();
        // }
        int len =(int) Math.ceil(Math.sqrt(arr.length));
        int[] A = new int[len];
        System.out.println("Value of len: " + len);
        int BS = (int) Math.sqrt(arr.length);

        for(int i=0;i<arr.length;i++){
            A[i/BS] += arr[i]; 
        }
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }

        System.out.println("Enter the range start:");
        int left = sr.nextInt();
        System.out.println("Enter the range end:");
        int right = sr.nextInt();

        if(left>right){
            System.out.println("invalid range");
            return;
        }

       
        int sum=0;
        while(left<=right){
            int x = left % BS;
            if(x!=0 && left<BS){  // the left<BS keeps check whether we are in the left part or not
                while(x<BS){
                    sum+=arr[x];
                    x++;
                }
                left++;
            }
            else if(left + BS -1 <= right){
                sum += A[left/BS];
                left += BS;
            }
            else{
                sum += arr[left];
                left++; 
            }
        }
        System.out.println("sum is : " + sum);
    }
}