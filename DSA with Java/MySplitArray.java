public class MySplitArray {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        int m = 2;
        System.out.println(splitArray(arr, m));
    }

    static int splitArray(int[] arr, int m) {

        // Find the range of answer:
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.max(arr[i], min);
            max += arr[i];
        }
        while (min < max) {
            int mid = min + (max - min) / 2;
            int pieces = 1;
            int sum = 0;
            for (int num : arr) {
                if (sum + num > mid) {
                    pieces++;
                    sum = num;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                min = mid + 1;
            } else {
                max = mid;
            }

        }

        return min;
    }
}
