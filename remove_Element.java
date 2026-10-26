class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Writer pointer

        for (int i = 0; i < nums.length; i++) {
            // Agar number target 'val' ke barabar nahi hai, to usko aage save kar lo
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k; // Valid elements ka count
    }
}