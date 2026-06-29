class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] ints = new int[nums.length][2]; // value, index
        for(int i = 0; i < nums.length; i++) { // O(n)
            ints[i][0] = nums[i];
            ints[i][1] = i;
        }
        
        Arrays.sort(ints, Comparator.comparingInt(i -> i[0])); // O (n log n)

        int[] pointer = {0, nums.length - 1};

        while(pointer[0] <= pointer[1]) { // O(n)
            int current = ints[pointer[0]][0] + ints[pointer[1]][0];
            if (current == target) {
                break;
            }
            if (current < target) {
                pointer[0]++;
            }
            if (current > target) {
                pointer[1]--;
            }
        }

        int[] result = {ints[pointer[0]][1], ints[pointer[1]][1]};
        Arrays.sort(result);
        return result;
    }
}
