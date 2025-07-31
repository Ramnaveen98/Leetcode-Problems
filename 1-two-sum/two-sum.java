class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> m= new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int ele=target-nums[i];
            if(m.containsKey(ele))
            {
                return new int[]{m.get(ele),i};
            }
            else
            {
                m.put(nums[i],i);
            }
        }
        return new int[0];
    }
}