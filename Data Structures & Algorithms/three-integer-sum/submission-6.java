class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums); // O(n log n)
        for (int i = 0; i < nums.length; i++) { // O(n^2)
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int numL = nums[l];
                int numR = nums[r];
                if (target + numL + numR == 0) {
                    result.add(List.of(target, numL, numR));
                    l++;
                    r--;
                }
                if (target + numL + numR < 0) {
                    l++;
                }
                if (target + numL + numR > 0) {
                    r--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
