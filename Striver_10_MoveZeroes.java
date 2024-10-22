class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0, end = 0;
        boolean flag= true;
        while(end<nums.length){
            flag = false;
            while(start<nums.length-1 && nums[start]!=0){
                start++;
            }
            end = start+1;
            while(end<nums.length && nums[end]==0){
                end++;
            }
            if(end<nums.length && start<nums.length){
            int a = nums[start];
            nums[start] = nums[end];
            nums[end] = a;
            flag = true;
            }
            if(!flag){
                break;
            }
        }
    }
}