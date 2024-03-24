class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr, 15));
    }

    static int ceiling(int[] arr, int target) {
        
        // but what if the target is less than the smallest number in the array
        if(target < arr[0]){
            return -1;
        }
        int s = 0;
        int e = arr.length - 1;
        int mid =-2;
        while (s <= e) {
            mid = (s + e) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                e=mid-1;
            } else if (arr[mid] < target) {
                s=mid + 1;
            }
        }
        return arr[e];
    }
}