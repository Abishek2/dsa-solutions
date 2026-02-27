class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // The "write" pointer (tracks unique elements)

        for (int j = 1; j < nums.length; j++) { // The "read" pointer
            // If we find a new unique value
            if (nums[j] != nums[i]) {
                i++;           // Move to the next slot
                nums[i] = nums[j]; // Write the unique value there
            }
        }

        // Return length (index + 1)
        return i + 1;
    }
}