class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[][] matrix = new int[nums.length][2];
        
        matrix[0][0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            matrix[i][0] = matrix[i - 1][0] * nums[i];
        }

        matrix[nums.length - 1][1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            matrix[i][1] = matrix[i + 1][1] * nums[i];
        }

        int[] result = new int[nums.length];
        
        result[0] = matrix[1][1];
        result[nums.length - 1] = matrix[nums.length - 2][0];
        
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = matrix[i - 1][0] * matrix[i + 1][1];
        }

        return result;
    }
}  
