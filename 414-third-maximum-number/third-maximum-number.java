class Solution {
    public int thirdMax(int[] nums) 
    {
        Long first =null;
        Long second=null;
        Long third=null;

        for(int num:nums)
        {
            long n=(long) num;

            if((first!=null && n==first) || (second!=null && n==second) ||(third!=null && n==third))
            {
                continue;
            }

            if(first ==null || n>first)
            {
                third=second;
                second=first;
                first=n;
            }else if(second==null || n>second)
            {
                third=second;
                second=n;
            }
            else if(third==null || n>third)
            {
                third=n;
            }
        }
        
            if (third == null) 
            {
                return first.intValue(); 
            } else 
            {
                    return third.intValue(); 
            }

        
    }
}