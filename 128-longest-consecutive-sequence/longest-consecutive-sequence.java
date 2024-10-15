class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int max = 0;
        if(nums.length == 0){
            return 0;
        }
        a:
        for(int i = 1; i < nums.length; i++){
                if(nums[i - 1] + 1 == nums[i]){

                    count++;

                     if(count > max){
                        max = count;
                    }
                  }
                 
                else{
                     if(nums[i - 1] == nums[i]){
                        continue a;
                    }
                    count = 0;
                }


        }
        return max + 1;
        
    }
}