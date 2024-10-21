class Solution {
    public boolean check(int[] nums) {
        int a= 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                a = i;
                break;
            }
        }
        if(a==0){
            return true;
        }
        int b = a;
        while(b!= a-1){
            if(b==nums.length-1){
                if(nums[b]<=nums[0]){
                    b = 0;
                }else{
                    return false;
                }
            }
            if(b==a-1){
                return true;
            }
            if(nums[b]<=nums[b+1]){
                b++;
            }else{
                return false;
            }
        }
        return true;
    }
}