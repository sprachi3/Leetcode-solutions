class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();

        if(p.length()>s.length()) return result;

        HashMap<Character,Integer> pMap=new HashMap<>();
        HashMap<Character,Integer> wMap=new HashMap<>();

        for(char ch:p.toCharArray()){
            pMap.put(ch,pMap.getOrDefault(ch,0)+1);
        }

        int left=0;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);

            wMap.put(ch,wMap.getOrDefault(ch,0)+1);

            if(right-left+1>p.length()){
                char remove=s.charAt(left);

                wMap.put(remove,wMap.get(remove)-1);

                if(wMap.get(remove)==0){
                    wMap.remove(remove);
                }

                left++;
            }

            if(wMap.equals(pMap)){
                result.add(left);
            }
        }
        
        return result;
    }
}