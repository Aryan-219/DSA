public class Peak2 {
    public static void main(String[] args) {
        System.out.println(findPeak(new int[] { 3,2,1}));
    }

    public static int findPeak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        if (s == e) {

            return s;
        } else {
            return -1;
        }
    }
}

// This is the approach of Kunal Kushwah