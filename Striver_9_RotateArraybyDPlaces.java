class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1 || k==nums.length){
            return;
        }
        if(k<nums.length){
            rotateList(0, nums.length-k-1,nums);
            rotateList(nums.length-k,nums.length-1,nums);
            rotateList(0,nums.length-1,nums);
        }else{
            int d = k%nums.length;
            rotateList(0, nums.length-d-1,nums);
            rotateList(nums.length-d,nums.length-1,nums);
            rotateList(0,nums.length-1,nums);
        }
    }
    public void rotateList(int start, int end, int[] arr){
        while(start<end){
            int a = arr[start];
            arr[start] = arr[end];
            arr[end] = a;
            start++;
            end--;
        }
    }
}