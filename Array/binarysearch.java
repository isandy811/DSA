class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int m=low + (high-low)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]<target){
                low=m+1;
            }
            else{
                high=m-1;
            }
        }
        return -1;
    }
}
