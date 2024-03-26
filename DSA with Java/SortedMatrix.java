public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        System.out.println(searchInSortedMatrix(arr, 5));
    }

    public static String searchInSortedMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            
            int start = 0;
            int end = arr[i].length-1;
            while( start <= end ) {
                int mid = start + (end-start) / 2;
                if(arr[i][mid] == target){
                    return i + " " + mid;
                }else if(arr[i][mid] < target){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return "-1,-1";
    }
}
