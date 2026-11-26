class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()) return false;

        HashMap<Character,Integer> sMap=new HashMap<>();
        HashMap<Character,Integer> wMap=new HashMap<>();

        for(char ch:s1.toCharArray()){
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);
        }

        int left=0;

        for(int r=0;r<s2.length();r++){
            char ch=s2.charAt(r);
            wMap.put(ch,wMap.getOrDefault(ch,0)+1);

            if(r-left+1>s1.length()){
                char remove=s2.charAt(left);

                wMap.put(remove,wMap.getOrDefault(remove,0)-1);

                if(wMap.get(remove)==0){
                    wMap.remove(remove);
                }

                left++;
            }

            if(wMap.equals(sMap)) return true;
        }

        return false;
        
    }
}