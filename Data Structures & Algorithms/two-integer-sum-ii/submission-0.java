class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while(l < r) {
            int n = numbers[l] + numbers[r];
            if (n == target) {
                break;
            }
            if (n < target) {
                l++;
            }
            if (n > target) {
                r--;
            }
        }
        int[] result = {++l, ++r};
        return result;
    }
}
