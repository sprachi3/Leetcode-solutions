class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //List<Integer> res=new ArrayList<>();
        int n=nums.length;

        // Map<Integer,Integer> map=new HashMap<>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }

        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     if(entry.getValue()>n/3) res.add(entry.getKey());
        // }

        // return res;
        Arrays.sort(nums);
        Set<Integer> ans=new HashSet<>();
        int left=0, right=n/3;
        while(right<n){
            if(nums[left]==nums[right]){
                ans.add(nums[left]);
                left=right;
                right=left+n/3;
            }
            left++;
            right++;
        }

        return new ArrayList<>(ans);
    }
}