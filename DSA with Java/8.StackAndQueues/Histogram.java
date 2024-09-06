public class Histogram {
    public static void main(String[] args) {
        int[] heights = { 8, 18 };
        int res = histogram(heights);
        System.out.println(res);
    }

    public static int histogram(int[] heights) {
        // Your implementation here

        // Checking if all values are equal
        boolean flag = true;
        if (heights[0] == heights[heights.length - 1]) {

            for (int i = 0; i < heights.length - 1; i++) {
                if (heights[i] != heights[i + 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return heights[heights.length - 1] * heights.length;
            }
        }

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int next = i + 1;
            int prev = i - 1;
            int countR = 1;
            int countL = 1;
            int areaR = 1;
            while (next < heights.length && heights[next] >= heights[i]) {

                countR++;
                next++;
            }
            areaR = heights[i] * countR;

            while (prev >= 0 && heights[prev] >= heights[i]) {
                countL++;
                prev--;
            }
            int areaL = heights[i] * countL;

            int totalArea = areaL + areaR - heights[i];
            maxArea = Math.max(maxArea, totalArea);
        }
        return maxArea;
    }
}
