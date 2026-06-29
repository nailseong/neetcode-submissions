class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) { // O(n)
            map.put(target - nums[i], i);
        }

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) { // O(n)
            if (!map.containsKey(nums[i])) {
                continue;
            }

            if (map.get(nums[i]) == i) {
                continue;
            }

            result[0] = Math.min(i, map.get(nums[i]));
            result[1] = Math.max(i, map.get(nums[i]));
            return result;
        }
        return result;
    }
}

/**
5, 0
3, 1
2, 2
4, 3
*/