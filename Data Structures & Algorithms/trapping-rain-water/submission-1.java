class Solution {
    public int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }
        int l = 0;
        int r = height.length - 1;
        int maxL = height[l];
        int maxR = height[r];
        int result = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                maxL = Math.max(maxL, height[l]);
                result += maxL - height[l];
                l++;
            } else {
                maxR = Math.max(maxR, height[r]);
                result += maxR - height[r];
                r--;
            }
        }

        return result;
    }
}
