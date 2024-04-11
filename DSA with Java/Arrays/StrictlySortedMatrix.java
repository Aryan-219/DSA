public class StrictlySortedMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 10, 12, 14, 18 }, { 20, 23, 26, 29 }, { 33, 37, 40, 41 }, { 44, 60, 69, 71 } };
        System.out.println(searchInSortedMatrix(arr, 30));

    }

    static String searchInSortedMatrix(int[][] arr, int target) {
        int rs = 0;
        int re = arr.length - 1;
        int mid = -1;
        while (rs < re) {
            if(rs+1 == re){
                mid = mid+1;
            }else{

                mid = rs + (re - rs) / 2;
            }
            if (arr[mid][0] == target) {
                return "[" + mid + ",0]";
            } else if (arr[mid][0] > target) {
                re = mid - 1;
            } else {
                rs = mid;
            }
            if (rs == re) {
                String x = binarySearch(arr, target, rs);
                // System.out.println(x);
                return x;
            }
        }
        return "[-1,-1]";
    }

    static String binarySearch(int[][] arr, int target, int r) {
        int cs = 0;
        int ce = arr[r].length - 1;
        while (cs <= ce) {
            int mid = cs + (ce - cs) / 2;
            if (arr[r][mid] == target) {
                return "[" + r + "," + mid + "]";
            } else if (arr[r][mid] > target) {
                ce = mid - 1;
            } else {
                cs = mid + 1;
            }
        }
        return "[-1,-1]";
    }

}

/*
 * 
 * [10,12,14,18|
 * |20,23,26,29|
 * |33,37,40,41|
 * |44,60,69,71]
 */