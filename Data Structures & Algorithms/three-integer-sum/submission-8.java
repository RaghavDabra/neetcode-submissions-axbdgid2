class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list= new ArrayList<>();
        for(int i =0; i< nums.length; i++)
        {
            if(nums[i] > 0) break;
            //coz if the pair of i is already greater 
            //we can't proceed to 0 at all
            if(i>0 && nums[i] == nums[i-1]) continue; // no same exact output his
            int left = i+1;
            int right = nums.length-1;
            while(left< right)
            {
                int sum = nums[left] + nums[i] + nums[right];
                if(sum>0)
                {
                    right --;
                }
                else if(sum<0)
                {
                    left++;
                }
                else{
                    list.add(Arrays.asList(nums[i],  nums[left] , nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                }
            }
        }
        return list;
    }
    }
