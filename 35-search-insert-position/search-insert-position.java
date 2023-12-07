class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while(i < nums.length){
            if (nums[i] == target){
                return i;
            }
            i++;
        }
        i = 0;
        while(i < nums.length - 1){
            if(nums[i] < target && target < nums[i+1]){
                return i+1;
            } 
            i++;
        }
        if(nums[nums.length - 1] < target){
            return nums.length;
        }
        return 0;
    }
}

/**
 * 드디어 나도 혼자 풀 수 있는 문제가 있구나 ㅜㅜ
 */