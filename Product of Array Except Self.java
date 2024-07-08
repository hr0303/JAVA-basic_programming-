class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] newArr = new int[l];
        int product = 1;
        int zeroCount = 0;

        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else {
                zeroCount++;
            }
        }

        if (zeroCount > 1) {
            // More than one zero, all products will be zero
            for (int j = 0; j < l; j++) {
                newArr[j] = 0;
            }
        } else if (zeroCount == 1) {
            // Exactly one zero, only the zero position will have the product of all other elements
            for (int j = 0; j < l; j++) {
                if (nums[j] == 0) {
                    newArr[j] = product;
                } else {
                    newArr[j] = 0;
                }
            }
        } else {
            // No zeros, compute the result using division
            for (int j = 0; j < l; j++) {
                newArr[j] = product / nums[j];
            }
        }

        return newArr;
    }
}
