class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        int maxLength=0,sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            sum = sum + A[i];
            if(sum==K){
                maxLength = Math.max(maxLength,i+1);
            }
            int rem = sum - K;
            if(map.containsKey(rem)){
                int length = i - map.get(rem);
                maxLength = Math.max(maxLength,length);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
        
    }
}