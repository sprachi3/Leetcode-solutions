class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> need=new HashMap<>();
        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }

        Map<Character,Integer> window=new HashMap<>();
        int have=0;
        int required=need.size();
        int minLen=Integer.MAX_VALUE;
        int start=0;
        int left=0;

        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);

            if(need.containsKey(c)&& window.get(c).intValue()==need.get(c).intValue()){
                have++;
            }

            while(have==required){
                if(minLen>right-left+1){
                    minLen=right-left+1;
                    start=left;
                }

                char leftC=s.charAt(left);
                window.put(leftC,window.get(leftC)-1);

                if(need.containsKey(leftC)&& window.get(leftC)<need.get(leftC)){
                    have--;
                }

                left++;
            }
        }

        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);

        
    }
}