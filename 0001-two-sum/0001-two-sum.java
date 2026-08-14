class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    result.add(i);
                    result.add(j);
                }
            }
        }
        int[] Arr = result.stream().mapToInt(i -> i).toArray();
        return Arr;
    }
}