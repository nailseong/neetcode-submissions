class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = -1;
        while (l < r) {
            int minHeight = Math.min(heights[l], heights[r]);
            int width = r - l;
            max = Math.max(max, minHeight * width);
            if (minHeight == heights[l]) {
                l++;
            }
            if (minHeight == heights[r]) {
                r--;
            }
        }
        return max;
    }
}
