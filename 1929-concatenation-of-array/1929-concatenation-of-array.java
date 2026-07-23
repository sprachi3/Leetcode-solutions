class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n=nums.length;
        int p=2*n;
        int[] ans=new int[p];

        for(int i=0;i<p;i++){
            ans[i]=nums[i%n];
        }
        return ans;
        
    }
}