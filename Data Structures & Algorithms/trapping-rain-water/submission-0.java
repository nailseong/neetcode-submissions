class Solution {
    public int trap(int[] height) {

        if (height.length < 3) {
            return 0;
        }

        int l = -1;

        int result = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int current = height[i];
            l = Math.max(l , height[i - 1]);
            if (current >= l) {
                continue;
            }
            int r = -1;
            for (int j = i+1; j < height.length; j++) {
                r = Math.max(r, height[j]);
            }
            if (current >= r) {
                continue;
            }
            result += Math.min(l, r) - current;
        }
        
        return result;
    }
}
