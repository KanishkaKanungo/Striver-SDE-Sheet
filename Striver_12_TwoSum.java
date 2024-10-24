class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int ans = target - nums[i];
            if(map.containsKey(ans) && map.get(ans)!=i){
                arr[0] = i;
                arr[1] = map.get(ans);
                break;
            }
        }
        return arr;
    }
}