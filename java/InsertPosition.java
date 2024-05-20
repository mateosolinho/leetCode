public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        InsertPosition i = new InsertPosition();
        int[] nums = { 1, 3, 5, 6 };
        i.searchInsert(nums, 2);
    }
}
