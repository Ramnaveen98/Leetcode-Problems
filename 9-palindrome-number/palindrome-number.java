class Solution {
    public boolean isPalindrome(int x) 
    {
        int res=0;
        int temp=x;
        while(x>0)
        {
            res=res*10 + (x%10);
            x=x/10;
        }
        if(res==temp)
            return true;
        else
            return false;
        
    }
}