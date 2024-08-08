public class RowColSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{12,22,33,44},{14,24,34,44},{16,26,36,46}};
        System.out.println(searchInSortedMatrix(arr, 33));
    }
    static String searchInSortedMatrix(int[][] arr, int target){
        for (int i = arr.length-1; i>=0; i--) {
            
            int r = 0;
            int c = i;
            while( r <= c ) {
                // int mid = r + (c-r) / 2;
                if(arr[r][c] == target){
                    return r + " " + c;
                }else if(arr[r][c] < target){
                    r++;
                    
                }else {
                    c--;
                }

            }
        }
        return "-1,-1";
    }
}

/*
 
 [10,20,30,40|
 |12,22,33,44|
 |14,24,34,44|
 |16,26,36,46]
 */

//  Time complexity : O(n)
// Space complexity : O(1)